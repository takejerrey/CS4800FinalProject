public class Restaurant {
    private String name;
    private String address;
    private County.Area operatingCounty;
    private RestaurantHours.Hours operatingHours;
    private String cuisineType;
    private Menu restaurantMenu;

    public Restaurant(String name, String address, County.Area operatingCounty, RestaurantHours.Hours operatingHours, String cuisineType, Menu restaurantMenu) {
        this.name = name;
        this.address = address;
        this.operatingCounty = operatingCounty;
        this.operatingHours = operatingHours;
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

    public RestaurantHours.Hours getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(RestaurantHours.Hours operatingHours) {
        this.operatingHours = operatingHours;
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
