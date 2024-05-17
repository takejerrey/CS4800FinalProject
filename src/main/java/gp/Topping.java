package main.java.gp;

public abstract class Topping extends Food {
    private final Food food;
    private final String name;
    private final double toppingPrice;
    
    public Topping(Food food, String name, double toppingPrice){
        super(food.getPrice(), food.getName(), food.getCarb(), food.getProtein(), food.getFat(), food.geFoodFactory());
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