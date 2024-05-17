package main.java.gp;

public class Fish extends Food {
    public Fish(double price, String name, Macronutrient carb, Macronutrient protein, Macronutrient fat, FoodFactory factory) {
        super(price, name, carb, protein, fat, factory);
    }

    @Override
    public String toString() {
        return "Fish: " + getName() + ", Price: " + getPrice();
    }
}
