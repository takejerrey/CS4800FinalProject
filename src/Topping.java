public abstract class Topping implements Food {
    private Food food;
    private String name;
    private double toppingPrice;
    
    public Topping(Food food, String name, double toppingPrice){
        this.food = food;
        this.name = name;
        this.toppingPrice = toppingPrice;
    } 

    @Override 
    public double getPrice() {
        return food.getPrice() + toppingPrice;
    }

    @Override
    public String getName() {
        return name;
    }
}