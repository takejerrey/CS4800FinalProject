public abstract class Food {
    private final double price;
    private final String name;
    private final Macronutrient carb;
    private final Macronutrient protein;
    private final Macronutrient fat;
    private final FoodFactory factory;

    public Food(double price, String name, Macronutrient carb, Macronutrient protein, Macronutrient fat, FoodFactory factory) {
        this.price = price;
        this.name = name;
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
        this.factory = factory;
    }

    public Food dietFood(Food food, DietaryRestriction.DietPlan diet) {
        return factory.getFood(food.getPrice(), food.getName(), diet);
    }

    public double getPrice()
    {
        return price;
    }

    public String getName()
    {
        return name;
    }

    public Macronutrient getCarb()
    {
        return carb;
    }

    public Macronutrient getProtein()
    {
        return protein;
    }

    public Macronutrient getFat()
    {
        return fat;
    }

    public FoodFactory geFoodFactory()
    {
        return factory;
    }
}