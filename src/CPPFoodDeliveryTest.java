import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPPFoodDeliveryTest
{
    private CPPFoodDelivery app;
    private Customer customer;
    private Restaurant restaurant;
    private Driver driver;

    @BeforeEach
    void setUp()
    {
        CPPFoodDelivery.resetInstance();
        app = CPPFoodDelivery.getInstance();
        SimulatedTime.getInstance().setTime(8, 0);

        customer = new Customer("C1", "101", County.Area.LA_COUNTY, DietaryRestriction.DietPlan.NO_RESTRICTION);
        app.registerCustomer(customer);

        restaurant = new Chilis("Chili's", "001", County.Area.LA_COUNTY, 8, 20, "Tex-Mex");
        app.registerRestaurant(restaurant);

        driver = DriverFactory.getDriver("D1", "201", County.Area.LA_COUNTY, 8, 16);
        app.registerDriver(driver);
    }

    @Test
    void registerCustomer()
    {
        assertTrue(app.getCustomers().contains(customer));
    }

    @Test
    void registerRestaurant()
    {
        assertTrue(app.getRestaurants().contains(restaurant));
    }

    @Test
    void registerDriver()
    {
        assertTrue(app.getDrivers().contains(driver));
    }

    @Test
    void placeValidOrder()
    {
        assertTrue(app.placeOrder("Chili's", "C1", new String[]{"Burger", "Cheese Burger"}));
    }

    @Test
    void placeNoRestaurantOrder()
    {
        assertFalse(app.placeOrder("Applebees", "C1", new String[]{"Burger", "Cheese Burger"}));
    }

    @Test
    void placeNoCustomerOrder()
    {
        assertFalse(app.placeOrder("Chili's", "C2", new String[]{"Burger", "Cheese Burger"}));
    }

    @Test
    void placeNoDriverOrder()
    {
        app.getDrivers().remove(0);
        assertFalse(app.placeOrder("Chili's", "C1", new String[]{"Burger", "Cheese Burger"}));
    }

    @Test
    void placeRestaurantClosedOrder()
    {
        SimulatedTime.getInstance().setTime(0, 0);
        assertFalse(app.placeOrder("Chili's", "C1", new String[]{"Burger", "Cheese Burger"}));
    }

    @Test
    void placeNoDriverInThisTimeOrder()
    {
        SimulatedTime.getInstance().setTime(18, 0);
        assertFalse(app.placeOrder("Chili's", "C1", new String[]{"Burger", "Cheese Burger"}));
    }

    @Test
    void placeNoDriverInLocationOrder()
    {
        app.getDrivers().get(0).setOperatingCounty(County.Area.ORANGE_COUNTY);
        assertFalse(app.placeOrder("Chili's", "C1", new String[]{"Burger", "Cheese Burger"}));
    }
}