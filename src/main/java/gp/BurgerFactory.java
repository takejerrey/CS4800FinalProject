package main.java.gp;

public class BurgerFactory extends FoodFactory {
    private static BurgerFactory factory = null;

    private BurgerFactory(){}

    public static BurgerFactory getInstance() {
        if(factory == null)
            factory = new BurgerFactory();
        return factory;
    }

    @Override
    Food getFood(double price, String name, DietaryRestriction.DietPlan dietPlan) {
        return new Burger(price, name, CarbFactory.getInstance().getMacronutrient(dietPlan),
                ProteinFactory.getInstance().getMacronutrient(dietPlan), FatFactory.getInstance().getMacronutrient(dietPlan), this);
    }
}
