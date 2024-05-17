import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        CPPFoodDelivery app = CPPFoodDelivery.getInstance();

        Menu m1 = new Menu();
        Food f1 = BurgerFactory.getInstance().getFood(1.00, "Burger", DietaryRestriction.DietPlan.NO_RESTRICTION);
        m1.addMenuItem(f1);
        m1.addToppingItem(new Cheese(f1, "Cheeseburger", 1.00));

        Restaurant r1 = new Restaurant("R1", "001", County.Area.LA_COUNTY, 8, 20, "CT1", m1);

        app.registerRestaurant(r1);

        Driver d1 = DriverFactory.getDriver("D1", "101", County.Area.LA_COUNTY, 8, 16);
        app.registerDriver(d1);

        Customer c1 = new Customer("C1", "201", County.Area.LA_COUNTY, DietaryRestriction.DietPlan.NO_RESTRICTION);
        app.registerCustomer(c1);

        ArrayList<Food> foodList = new ArrayList<>();
        foodList.add(m1.orderMenuItem("Burger"));
        foodList.add(m1.addTopping("Cheeseburger"));

        app.placeOrder(r1, c1, foodList);
    }
}