public class Main {
    public static void main(String[] args)
    {
        CPPFoodDelivery app = CPPFoodDelivery.getInstance();

        Restaurant r1 = new Restaurant("R1", "001", County.Area.LA_COUNTY, 8, 20, "CT1");
        r1.addMenuItem(BurgerFactory.getInstance().getFood(1.00, "Burger", DietaryRestriction.DietPlan.NO_RESTRICTION));
        r1.addToppingItem("Burger", "Cheese");
        app.registerRestaurant(r1);

        Driver d1 = DriverFactory.getDriver("D1", "101", County.Area.LA_COUNTY, 8, 16);
        app.registerDriver(d1);

        Customer c1 = new Customer("C1", "201", County.Area.LA_COUNTY, DietaryRestriction.DietPlan.NO_RESTRICTION);
        app.registerCustomer(c1);

        app.placeOrder(r1, c1, new String[]{"Burger", "Cheeseburger"});
    }
}