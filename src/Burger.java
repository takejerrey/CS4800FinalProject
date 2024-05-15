public class Burger implements Food {
    double price; 
    String name;
    Macronutrient carb;
    Macronutrient protein;
    Macronutrient fat;
    
    public Burger(double price, String name, Macronutrient carb, Macronutrient protein, Macronutrient fat) {
        this.price = price;
        this.name = name;
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }
    
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}