public class PastaFactory extends FoodFactory {
    private static PastaFactory factory = null;

    private PastaFactory(){}

    public static PastaFactory getInstance() {
        if(factory == null)
            factory = new PastaFactory();
        return factory;
    }

    @Override
    Food getFood(double price, String name, DietaryRestriction.DietPlan dietPlan) {
        return new Pasta(price, name, CarbFactory.getInstance().getMacronutrient(dietPlan),
                ProteinFactory.getInstance().getMacronutrient(dietPlan), FatFactory.getInstance().getMacronutrient(dietPlan), this);
    }
}
