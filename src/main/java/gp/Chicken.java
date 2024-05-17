package main.java.gp;

public class Chicken extends Food
{
    public Chicken(double price, String name, Macronutrient carb, Macronutrient protein, Macronutrient fat, FoodFactory factory)
    {
        super(price, name, carb, protein, fat, factory);
    }
}
