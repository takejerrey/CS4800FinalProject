import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class CPPFoodDelivery {
    private static CPPFoodDelivery instance;
    private final List<Customer> customers = new ArrayList<>();
    private final List<Restaurant> restaurants = new ArrayList<>();
    private final List<Driver> drivers = new ArrayList<>();

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
        System.out.println("Customer registered: " + customer.getName());
    }

    public void registerRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
        System.out.println("Restaurant registered: " + restaurant.getName());
    }

    public void registerDriver(Driver driver) {
        drivers.add(driver);
        System.out.println("Driver registered: " + driver.getName());
    }

    public void placeOrder(String restaurantName, String customerName, String[] foodNames)
    {
        Restaurant restaurant = findRestaurant(restaurantName);
        Customer customer = findCustomer(customerName);

        SimulatedTime currentTime = SimulatedTime.getInstance();

        if (restaurant == null || customer == null)
        {
            return;
        }

        // Check if restaurant is open
        if (!TimeStamp.isWithinRange(currentTime.toTimeStamp(), restaurant.getOpenTime(), restaurant.getCloseTime()))
        {
            System.out.println(restaurant.getName() + " is closed!");
            return;
        }

        Driver driver = findDriver(restaurant.getOperatingCounty());

        if (driver == null)
        {
            return;
        }

        System.out.println("\n==================== Order Details ====================");
        System.out.println("Order placed by: " + customer.getName());
        System.out.println("Restaurant: " + restaurant.getName());
        System.out.println("Order time: " + currentTime);
        System.out.println("Driver assigned: " + driver.getName());
        System.out.println("=======================================================");

        Order order = new Order(restaurant, customer, driver);

        for (String foodName : foodNames)
        {
            Food food = restaurant.getFoodByName(foodName);
            food = food.dietFood(food, customer.getDiet());
            order.addFood(food);
        }

        System.out.println("Total Order Cost: $" + String.format("%.2f", order.getTotalOrderCost()));

        order.simulatePickup();

        order.simulateDelivery();

        System.out.println("Order Contents:");
        for (Food food : order.getFoodItems()) {
            System.out.println(" - " + food.getName());
        }
        System.out.println("=======================================================\n");
    }

    public void displayRegisteredRestaurants()
    {
        System.out.println("\n================ Registered Restaurants ================");
        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant.getName() + " (Open " + restaurant.getOpenTime() + " to " + restaurant.getCloseTime() + ")");
        }
        System.out.println("=======================================================\n");
    }


    private Restaurant findRestaurant(String restaurantName)
    {
        for (Restaurant restaurant : restaurants)
        {
            if (restaurant.getName().equals(restaurantName))
            {
                return restaurant;
            }
        }

        System.out.println("Restaurant " + restaurantName + " not found!");
        return null;
    }

    private Customer findCustomer(String customerName)
    {
        for (Customer customer : customers)
        {
            if (customer.getName().equals(customerName))
            {
                return customer;
            }
        }

        System.out.println("Customer " + customerName + " not found!");
        return null;
    }

    private Driver findDriver(County.Area county)
    {
        SimulatedTime currentTime = SimulatedTime.getInstance();
        List<Driver> validDrivers = new ArrayList<>();

        for (Driver driver : drivers)
        {
            // Need to be working the current time, and need to be working in the restaurants county
            if (TimeStamp.isWithinRange(currentTime.toTimeStamp(), driver.getShiftStart(), driver.getShiftEnd())
            && county.equals(driver.getOperatingCounty())
            )
            {
                validDrivers.add(driver);
            }
        }

        if (validDrivers.isEmpty())
        {
            System.out.println("No drivers found for this county or time!");
            return null;
        }

        return validDrivers.get(new Random().nextInt(validDrivers.size()));
    }
}
