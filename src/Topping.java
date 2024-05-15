public abstract class Topping implements Food {
    private Food food;
    private String name;
    
    public Topping(Food food, String name){ 
        this.food = food;
        this.name = name;
    } 

    @Override 
    public double getPrice() {
        return food.getPrice();
    }

    @Override
    public String getName() {
        return name;
    }
}