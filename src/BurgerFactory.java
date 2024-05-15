public class BurgerFactory extends FoodFactory {
    private static BurgerFactory factory = null;

    BurgerFactory(){}

    public static BurgerFactory getInstance() {
        if(factory == null)
            factory = new BurgerFactory();
        return factory;
    }

    @Override
    Food getFood(String dietPlan) {
        return new Burger(0, dietPlan, new CarbFactory().getMacronutrient(dietPlan), new CarbFactory().getMacronutrient(dietPlan), new CarbFactory().getMacronutrient(dietPlan));
    }
}
