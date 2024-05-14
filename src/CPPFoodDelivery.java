import java.util.ArrayList;
import java.util.List;

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

}
