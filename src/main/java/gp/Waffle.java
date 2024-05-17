package main.java.gp;

public class Waffle extends Food
{
    public Waffle(double price, String name, Macronutrient carb, Macronutrient protein, Macronutrient fat, FoodFactory factory)
    {
        super(price, name, carb, protein, fat, factory);
    }
}
