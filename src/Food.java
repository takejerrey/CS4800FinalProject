public abstract class Food {
    private final double price;
    private final String name;
    private final Macronutrient carb;
    private final Macronutrient protein;
    private final Macronutrient fat;

    public Food(double price, String name, Macronutrient carb, Macronutrient protein, Macronutrient fat) {
        this.price = price;
        this.name = name;
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    public double getPrice()
    {
        return price;
    }

    public String getName()
    {
        return name;
    }
} 