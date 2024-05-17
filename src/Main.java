public class Main {
    public static void main(String[] args) {
        CPPFoodDelivery app = CPPFoodDelivery.getInstance();

        app.registerRestaurant(new Chilis("Chili's", "001", County.Area.LA_COUNTY, 8, 20, "Tex-Mex"));
        app.registerRestaurant(new Applebees("Applebees", "002", County.Area.LA_COUNTY, 10, 22, "American"));
        app.registerRestaurant(new WaffleHouse("WaffleHouse", "003", County.Area.LA_COUNTY, 6, 24, "Breakfast"));
        app.registerRestaurant(new RedLobster("RedLobster", "004", County.Area.LA_COUNTY, 11, 23, "Seafood"));

        app.registerDriver(DriverFactory.getDriver("D1", "101", County.Area.LA_COUNTY, 8, 16));
        app.registerCustomer(new Customer("C1", "201", County.Area.LA_COUNTY, DietaryRestriction.DietPlan.VEGAN));

        app.displayRegisteredRestaurants();

        app.placeOrder("Chili's", "C1", new String[]{"Burger", "Cheese Burger"});
        app.placeOrder("Applebees", "C1", new String[]{"Burger", "Bacon Burger"});
        app.placeOrder("WaffleHouse", "C1", new String[]{"Waffle", "Syrup Waffle"});
        app.placeOrder("RedLobster", "C1", new String[]{"Grilled Salmon", "Lemon Grilled Salmon"});

        app.registerDriver(DriverFactory.getDriver("D2", "102", County.Area.LA_COUNTY, 18, 0));
        app.registerCustomer(new Customer("C2", "202", County.Area.LA_COUNTY, DietaryRestriction.DietPlan.PALEO));

        SimulatedTime.getInstance().setTime(18, 0);

        app.placeOrder("Chili's", "C2", new String[]{"Chicken Strips", "BBQ Chicken Strips", "Burger"});
        app.placeOrder("Applebees", "C2", new String[]{"Pasta", "Cheese Pasta", "Avocado"});
        app.placeOrder("WaffleHouse", "C2", new String[]{"Chicken Strips", "BBQ Chicken Strips", "HashBrowns"});
        app.placeOrder("RedLobster", "C2", new String[]{"Chicken Breast", "BBQ Chicken Breast", "Garlic Bread"});

        SimulatedTime.getInstance().setTime(17, 0);
        app.placeOrder("Chili's", "C2", new String[]{"Chicken Strips", "BBQ Chicken Strips", "Burger"});
    }
}
