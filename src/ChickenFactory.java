public class ChickenFactory extends FoodFactory
{
    private static ChickenFactory factory = null;

    private ChickenFactory(){}

    public static ChickenFactory getInstance() {
        if(factory == null)
            factory = new ChickenFactory();
        return factory;
    }
    @Override
    Food getFood(double price, String name, DietaryRestriction.DietPlan dietPlan)
    {
        return new Chicken(price, name, CarbFactory.getInstance().getMacronutrient(dietPlan),
                ProteinFactory.getInstance().getMacronutrient(dietPlan), FatFactory.getInstance().getMacronutrient(dietPlan), this);
    }
}
