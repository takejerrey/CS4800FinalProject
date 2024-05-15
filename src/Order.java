import java.util.ArrayList; 
import java.text.DecimalFormat; 

public class Order {
    private ArrayList<Food> foodItems;
    private Customer customer;
    
    public Order(Customer customer) {
        this.customer = customer;
        foodItems = new ArrayList<Food>();
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
} 