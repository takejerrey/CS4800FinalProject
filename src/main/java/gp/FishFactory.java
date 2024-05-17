package main.java.gp;

public class FishFactory extends FoodFactory {
    private static FishFactory factory = null;

    private FishFactory() {}

    public static FishFactory getInstance() {
        if(factory == null)
            factory = new FishFactory();
        return factory;
    }

    @Override
    Food getFood(double price, String name, DietaryRestriction.DietPlan dietPlan) {
        return new Fish(price, name, CarbFactory.getInstance().getMacronutrient(dietPlan),
                ProteinFactory.getInstance().getMacronutrient(dietPlan), FatFactory.getInstance().getMacronutrient(dietPlan), this);
    }
}
