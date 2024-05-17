public class Main {
    public static void main(String[] args) {
        CPPFoodDelivery app = CPPFoodDelivery.getInstance();

        // Register Restaurants
        app.registerRestaurant(new Chilis("Chili's", "001", County.Area.LA_COUNTY, 8, 20, "Tex-Mex"));
        app.registerRestaurant(new Applebees("Applebees", "002", County.Area.LA_COUNTY, 10, 22, "American"));
        app.registerRestaurant(new WaffleHouse("WaffleHouse", "003", County.Area.SAN_BERNARDINO_COUNTY, 6, 24, "Breakfast"));
        app.registerRestaurant(new RedLobster("RedLobster", "004", County.Area.ORANGE_COUNTY, 11, 23, "Seafood"));

        // Register Drivers
        app.registerDriver(DriverFactory.getDriver("D1", "101", County.Area.LA_COUNTY, 8, 16));
        app.registerDriver(DriverFactory.getDriver("D2", "102", County.Area.LA_COUNTY, 16, 0));
        app.registerDriver(DriverFactory.getDriver("D3", "103", County.Area.LA_COUNTY, 0, 8));
        app.registerDriver(DriverFactory.getDriver("D4", "104", County.Area.SAN_BERNARDINO_COUNTY, 8, 16));
        app.registerDriver(DriverFactory.getDriver("D5", "105", County.Area.SAN_BERNARDINO_COUNTY, 16, 0));
        app.registerDriver(DriverFactory.getDriver("D6", "106", County.Area.SAN_BERNARDINO_COUNTY, 0, 8));
        app.registerDriver(DriverFactory.getDriver("D7", "107", County.Area.ORANGE_COUNTY, 8, 16));
        app.registerDriver(DriverFactory.getDriver("D8", "108", County.Area.ORANGE_COUNTY, 16, 0));

        // Register Customers
        app.registerCustomer(new Customer("C1", "201", County.Area.LA_COUNTY, DietaryRestriction.DietPlan.VEGAN));
        app.registerCustomer(new Customer("C2", "202", County.Area.LA_COUNTY, DietaryRestriction.DietPlan.PALEO));
        app.registerCustomer(new Customer("C3", "203", County.Area.LA_COUNTY, DietaryRestriction.DietPlan.NUT_ALLERGY));
        app.registerCustomer(new Customer("C4", "204", County.Area.LA_COUNTY, DietaryRestriction.DietPlan.NO_RESTRICTION));
        app.registerCustomer(new Customer("C5", "205", County.Area.SAN_BERNARDINO_COUNTY, DietaryRestriction.DietPlan.VEGAN));
        app.registerCustomer(new Customer("C6", "206", County.Area.SAN_BERNARDINO_COUNTY, DietaryRestriction.DietPlan.PALEO));
        app.registerCustomer(new Customer("C7", "207", County.Area.SAN_BERNARDINO_COUNTY, DietaryRestriction.DietPlan.NUT_ALLERGY));
        app.registerCustomer(new Customer("C8", "208", County.Area.ORANGE_COUNTY, DietaryRestriction.DietPlan.NO_RESTRICTION));
        app.registerCustomer(new Customer("C9", "209", County.Area.ORANGE_COUNTY, DietaryRestriction.DietPlan.VEGAN));
        app.registerCustomer(new Customer("C10", "210", County.Area.ORANGE_COUNTY, DietaryRestriction.DietPlan.PALEO));

        // Display Registered Restaurants
        app.displayRegisteredRestaurants();

        // Customer C1 orders from Chili's
        app.placeOrder("Chili's", "C1", new String[]{"Burger", "Cheese Burger"});
        // Customer C2 orders from Applebees
        app.placeOrder("Applebees", "C2", new String[]{"Burger", "Bacon Burger"});
        // Customer C3 orders from WaffleHouse
        app.placeOrder("WaffleHouse", "C3", new String[]{"Waffle", "Syrup Waffle"});
        // Customer C4 orders from RedLobster
        app.placeOrder("RedLobster", "C4", new String[]{"Grilled Salmon", "Lemon Grilled Salmon"});

        // Register more drivers and customers
        app.registerDriver(DriverFactory.getDriver("D9", "109", County.Area.LA_COUNTY, 16, 0));
        app.registerCustomer(new Customer("C11", "211", County.Area.LA_COUNTY, DietaryRestriction.DietPlan.VEGAN));

        // Set simulated time and place additional orders
        SimulatedTime.getInstance().setTime(18, 0);

        // More orders
        app.placeOrder("Chili's", "C2", new String[]{"Chicken Strips", "BBQ Chicken Strips", "Burger"});
        app.placeOrder("Applebees", "C3", new String[]{"Pasta", "Cheese Pasta", "Avocado"});
        app.placeOrder("WaffleHouse", "C4", new String[]{"Chicken Strips", "BBQ Chicken Strips", "HashBrowns"});
        app.placeOrder("RedLobster", "C5", new String[]{"Chicken Breast", "BBQ Chicken Breast", "Garlic Bread"});

        SimulatedTime.getInstance().setTime(17, 0);
        app.placeOrder("Chili's", "C6", new String[]{"Chicken Strips", "BBQ Chicken Strips", "Burger"});
        app.placeOrder("Applebees", "C7", new String[]{"Burger", "Bacon Burger"});
        app.placeOrder("WaffleHouse", "C8", new String[]{"Waffle", "Syrup Waffle"});
        app.placeOrder("RedLobster", "C9", new String[]{"Grilled Salmon", "Lemon Grilled Salmon"});
        app.placeOrder("Chili's", "C10", new String[]{"Chicken Strips", "BBQ Chicken Strips", "Burger"});
    }
}
