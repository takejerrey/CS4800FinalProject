public class AvocadoFactory extends FoodFactory {
    private static AvocadoFactory factory = null;

    private AvocadoFactory(){}

    public static AvocadoFactory getInstance() {
        if(factory == null)
            factory = new AvocadoFactory();
        return factory;
    }

    @Override
    Food getFood(double price, String name, DietaryRestriction.DietPlan dietPlan) {
        return new Burger(price, name, CarbFactory.getInstance().getMacronutrient(dietPlan),
                ProteinFactory.getInstance().getMacronutrient(dietPlan), FatFactory.getInstance().getMacronutrient(dietPlan), this);
    }
}
