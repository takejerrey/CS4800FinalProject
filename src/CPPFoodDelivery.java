import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class CPPFoodDelivery {
    private static CPPFoodDelivery instance;
    private List<Customer> customers = new ArrayList<>();
    private List<Restaurant> restaurants = new ArrayList<>();
    private List<Driver> drivers = new ArrayList<>();

    private CPPFoodDelivery() {
    }

    public static CPPFoodDelivery getInstance() {
        if (instance == null) {
            instance = new CPPFoodDelivery();
        }
        return instance;
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public void registerRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    public void placeOrder(Restaurant restaurant, Customer customer, List<Food> foodList)
    {
        SimulatedTime currentTime = SimulatedTime.getInstance();

        System.out.println("Order placed with " + restaurant.getName() + " at " + currentTime);
        Order order = new Order(restaurant, customer, findDriver(new TimeStamp(currentTime.getHour(), currentTime.getMinutes())));

        for (Food food : foodList)
        {
            order.addFood(food);
        }

        System.out.println("Order cost: $" + String.format("%.2f", order.getTotalOrderCost()));

        order.simulatePickup();
        System.out.println("Order picked up by " + order.getDriver().getName() + " at " + currentTime);

        order.simulateDelivery();
        System.out.println("Order delivered by " + order.getDriver().getName() + " at " + currentTime);

        System.out.println("Order contents: ");

        for (Food food : foodList)
        {
            System.out.println("[" + food.getName() + "]");
        }
    }

    private Driver findDriver(TimeStamp timestamp)
    {
        SimulatedTime currentTime = SimulatedTime.getInstance();
        List<Driver> validDrivers = new ArrayList<>();

        for (Driver driver : drivers)
        {
            if (TimeStamp.isWithinRange(currentTime.toTimeStamp(), driver.getShiftStart(), driver.getShiftEnd()))
            {
                validDrivers.add(driver);
            }
        }

        if (validDrivers.isEmpty())
        {
            System.out.println("No drivers found!");
            return null;
        }

        return validDrivers.get(new Random().nextInt(validDrivers.size()));
    }
}
