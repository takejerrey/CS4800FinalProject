public class Cheese extends Topping {
    private double cheesePrice;
    
    public Cheese(Food food, String name, double cheesePrice) {
        super(food, name );
        this.cheesePrice = cheesePrice;
    }
    
    @Override
    public double getPrice() {
        return super.getPrice() + cheesePrice;
    }
} 