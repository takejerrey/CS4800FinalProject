package main.java.gp;

public class Burger extends Food {

    public Burger(double price, String name, Macronutrient carb, Macronutrient protein, Macronutrient fat, FoodFactory factory) {
        super(price, name, carb, protein, fat, factory);
    }
}