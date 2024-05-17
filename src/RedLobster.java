public class RedLobster extends Restaurant {
    public RedLobster(String name, String address, County.Area operatingCounty, int openingHour, int closingHour, String cuisineType) {
        super(name, address, operatingCounty, openingHour, closingHour, cuisineType);

        // Adding protein options
        addMenuItem(FishFactory.getInstance().getFood(4.00, "Grilled Salmon", DietaryRestriction.DietPlan.NO_RESTRICTION));
        addToppingItem("Grilled Salmon", "Lemon");
        addMenuItem(ChickenFactory.getInstance().getFood(3.50, "Chicken Breast", DietaryRestriction.DietPlan.PALEO));
        addToppingItem("Chicken Breast", "BBQ");

        // Adding Carbs menu item
        addMenuItem(PastaFactory.getInstance().getFood(2.50, "Garlic Bread", DietaryRestriction.DietPlan.VEGAN));
        addToppingItem("Garlic Bread", "Cheese");

        // Adding Fats menu item
        addMenuItem(AvocadoFactory.getInstance().getFood(2.00, "Avocado Salad", DietaryRestriction.DietPlan.NUT_ALLERGY));
        addToppingItem("Avocado Salad", "");

        // Adding extra topping item
        addToppingItem("Garlic Bread", "Butter");
    }

    @Override
    public void addToppingItem(String foodName, String toppingName) {
        Topping addition;
        Food existingMenuItem = getFoodByName(foodName);
        String newToppingName = toppingName + " " + existingMenuItem.getName();

        addition = switch (toppingName) {
            case "Lemon" -> new Lemon(existingMenuItem, newToppingName, 1.00);
            case "BBQ" -> new BBQ(existingMenuItem, newToppingName, 1.00);
            case "Cheese" -> new Cheese(existingMenuItem, newToppingName, 1.00);
            case "Butter" -> new Butter(existingMenuItem, newToppingName, 0.75);
            default -> null;
        };

        super.getRestaurantMenu().addToppingItem(addition);
    }
}
