public class Restaurant {
    private String name;
    private String address;
    private County.Area operatingCounty;
    private TimeStamp openTime;
    private TimeStamp closeTime;
    private String cuisineType;
    private Menu restaurantMenu;

    public Restaurant(String name, String address, County.Area operatingCounty, int openingHour, int closingHour, String cuisineType) {
        this.name = name;
        this.address = address;
        this.operatingCounty = operatingCounty;
        this.openTime = new TimeStamp(openingHour, 0);
        this.closeTime = new TimeStamp(closingHour, 0);
        this.cuisineType = cuisineType;
        this.restaurantMenu = new Menu();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public County.Area getOperatingCounty() {
        return operatingCounty;
    }

    public void setOperatingCounty(County.Area operatingCounty) {
        this.operatingCounty = operatingCounty;
    }

    public TimeStamp getOpenTime()
    {
        return openTime;
    }

    public void setOpenTime(TimeStamp openTime)
    {
        this.openTime = openTime;
    }

    public TimeStamp getCloseTime()
    {
        return closeTime;
    }

    public void setCloseTime(TimeStamp closeTime)
    {
        this.closeTime = closeTime;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public Menu getRestaurantMenu() {
        return restaurantMenu;
    }

    public void setRestaurantMenu(Menu restaurantMenu) {
        this.restaurantMenu = restaurantMenu;
    }

    /**
     * Checks for food in both normal existing menu items and existing topping items.
     */
    public Food getFoodByName(String name)
    {
        for (Food food : restaurantMenu.getMenuItems())
        {
            if (food.getName().equals(name))
            {
                return food;
            }
        }

        for (Topping topping : restaurantMenu.getExtraToppings())
        {
            if (topping.getName().equals(name))
            {
                return topping;
            }
        }

        System.out.println("Food " + name + " not found!");
        return null;
    }

    public void addMenuItem(Food food)
    {
        restaurantMenu.addMenuItem(food);
    }

    public void addToppingItem(String foodName, String toppingName)
    {
        Topping addition = null;
        Food existingMenuItem = getFoodByName(foodName);

        switch (toppingName)
        {
            case "Cheese":
                addition = new Cheese(existingMenuItem, "Cheeseburger", 1.00);
                break;
        }

        restaurantMenu.addToppingItem(addition);
    }
}
