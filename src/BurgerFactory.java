public class BurgerFactory extends FoodFactory {
    private static BurgerFactory factory = null;

    BurgerFactory(){}

    public static BurgerFactory getInstance() {
        if(factory == null)
            factory = new BurgerFactory();
        return factory;
    }

    @Override
    Food getFood(double price, String name, DietaryRestriction.DietPlan dietPlan) {
        return new Burger(price, name, new CarbFactory().getMacronutrient(dietPlan),
                new CarbFactory().getMacronutrient(dietPlan), new CarbFactory().getMacronutrient(dietPlan));
    }
}
