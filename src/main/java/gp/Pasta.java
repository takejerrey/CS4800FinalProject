package main.java.gp;

public class Pasta extends Food
{
    public Pasta(double price, String name, Macronutrient carb, Macronutrient protein, Macronutrient fat, FoodFactory factory)
    {
        super(price, name, carb, protein, fat, factory);
    }
}
