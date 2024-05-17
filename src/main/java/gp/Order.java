package main.java.gp;

import java.util.ArrayList;
import java.text.DecimalFormat; 

public class Order {
    private final Restaurant restaurant;
    private final Customer customer;
    private final Driver driver;

    private final ArrayList<Food> foodItems;

    private final TimeStamp creationTime = SimulatedTime.getInstance().toTimeStamp();
    private TimeStamp pickupTime;
    private TimeStamp deliveryTime;
    
    public Order(Restaurant restaurant, Customer customer, Driver driver) {
        this.restaurant = restaurant;
        this.customer = customer;
        this.driver = driver;
        foodItems = new ArrayList<>();
    }
    
    public void addFood(Food food){
        foodItems.add(food);
    }
    
    public ArrayList<Food> getFoodItems() {
        return foodItems;
    }
    
    public double getTotalOrderCost(){
        double totalCost = 0;
        DecimalFormat dollarFormat = new DecimalFormat("$####.##");
        dollarFormat.setMinimumFractionDigits(2);
        for (Food food : foodItems) {
            totalCost += food.getPrice();
        }
        return totalCost;
    }

    public void simulatePickup()
    {
        SimulatedTime.getInstance().updateTime();
        driver.pickupFood(this);
        this.pickupTime = SimulatedTime.getInstance().toTimeStamp();
    }

    public void simulateDelivery() {
        SimulatedTime.getInstance().updateTime();
        driver.deliverFood(this);
        this.deliveryTime = SimulatedTime.getInstance().toTimeStamp();
    }

    public Restaurant getRestaurant()
    {
        return restaurant;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public Driver getDriver()
    {
        return driver;
    }

    public TimeStamp getCreationTime()
    {
        return creationTime;
    }

    public TimeStamp getPickupTime()
    {
        return pickupTime;
    }

    public TimeStamp getDeliveryTime()
    {
        return deliveryTime;
    }
}