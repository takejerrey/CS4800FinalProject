public class Main {
    public static void main(String[] args)
    {
        CPPFoodDelivery app = CPPFoodDelivery.getInstance();

        app.registerRestaurant(new Chilis("Chili's", "001", County.Area.LA_COUNTY, 8, 20, "Tex-Mex"));
        app.registerDriver(DriverFactory.getDriver("D1", "101", County.Area.LA_COUNTY, 8, 16));
        app.registerCustomer(new Customer("C1", "201", County.Area.LA_COUNTY, DietaryRestriction.DietPlan.VEGAN));

        app.displayRegisteredRestaurants();

        app.placeOrder("Chili's", "C1", new String[]{"Burger", "Cheese Burger"});

        app.registerDriver(DriverFactory.getDriver("D2", "102", County.Area.LA_COUNTY, 18, 0));
        app.registerCustomer(new Customer("C2", "202", County.Area.LA_COUNTY, DietaryRestriction.DietPlan.PALEO));

        SimulatedTime.getInstance().setTime(18, 0);

        app.placeOrder("Chili's", "C2", new String[]{"Chicken Strips", "BBQ Chicken Strips", "Burger"});

        SimulatedTime.getInstance().setTime(17, 0);
        app.placeOrder("Chili's", "C2", new String[]{"Chicken Strips", "BBQ Chicken Strips", "Burger"});
    }
}