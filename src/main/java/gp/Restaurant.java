package main.java.gp;

public abstract class Restaurant {
    private final String name;
    private final String address;
    private final County.Area operatingCounty;
    private final TimeStamp openTime;
    private final TimeStamp closeTime;
    private final String cuisineType;
    private final Menu restaurantMenu;

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

    public String getAddress() {
        return address;
    }

    public County.Area getOperatingCounty() {
        return operatingCounty;
    }

    public TimeStamp getOpenTime()
    {
        return openTime;
    }

    public TimeStamp getCloseTime()
    {
        return closeTime;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public Menu getRestaurantMenu() {
        return restaurantMenu;
    }

    /**
     * Checks for food in both normal existing menu items and existing topping items.
     */
    public Food getFoodByName(String name)
    {
        name = name.toLowerCase();
        for (Food food : restaurantMenu.getMenuItems())
        {
            if (food.getName().toLowerCase().equals(name))
            {
                return food;
            }
        }

        for (Topping topping : restaurantMenu.getExtraToppings())
        {
            if (topping.getName().toLowerCase().equals(name))
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

    abstract public void addToppingItem(String foodName, String toppingName);
}
