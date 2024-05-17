public class ChickenFactory extends FoodFactory
{
    private static ChickenFactory factory = null;

    ChickenFactory(){}

    public static ChickenFactory getInstance() {
        if(factory == null)
            factory = new ChickenFactory();
        return factory;
    }
    @Override
    Food getFood(double price, String name, DietaryRestriction.DietPlan dietPlan)
    {
        return new Chicken(price, name, new CarbFactory().getMacronutrient(dietPlan),
                new CarbFactory().getMacronutrient(dietPlan), new CarbFactory().getMacronutrient(dietPlan));
    }
}
