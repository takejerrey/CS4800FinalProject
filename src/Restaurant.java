public class Restaurant {
    private String name;
    private String address;
    private County.Area operatingCounty;
    private TimeStamp openTime;
    private TimeStamp closeTime;
    private String cuisineType;
    private Menu restaurantMenu;

    public Restaurant(String name, String address, County.Area operatingCounty, int openingHour, int closingHour, String cuisineType, Menu restaurantMenu) {
        this.name = name;
        this.address = address;
        this.operatingCounty = operatingCounty;
        this.openTime = new TimeStamp(openingHour, 0);
        this.closeTime = new TimeStamp(closingHour, 0);
        this.cuisineType = cuisineType;
        this.restaurantMenu = restaurantMenu;
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
}
