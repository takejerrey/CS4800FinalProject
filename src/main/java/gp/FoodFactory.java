package main.java.gp;

public abstract class FoodFactory {
    abstract Food getFood(double price, String name, DietaryRestriction.DietPlan dietPlan);
}
