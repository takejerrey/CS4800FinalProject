public class WaffleFactory extends FoodFactory {
    private static WaffleFactory factory = null;

    private WaffleFactory(){}

    public static WaffleFactory getInstance() {
        if(factory == null)
            factory = new WaffleFactory();
        return factory;
    }

    @Override
    Food getFood(double price, String name, DietaryRestriction.DietPlan dietPlan) {
        return new Waffle(price, name, CarbFactory.getInstance().getMacronutrient(dietPlan),
                ProteinFactory.getInstance().getMacronutrient(dietPlan), FatFactory.getInstance().getMacronutrient(dietPlan), this);
    }
}
