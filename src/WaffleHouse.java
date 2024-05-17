public class WaffleHouse extends Restaurant {
    public WaffleHouse(String name, String address, County.Area operatingCounty, int openingHour, int closingHour, String cuisineType) {
        super(name, address, operatingCounty, openingHour, closingHour, cuisineType);

        // Adding protein
        addMenuItem(WaffleFactory.getInstance().getFood(1.00, "Waffle", DietaryRestriction.DietPlan.NO_RESTRICTION));
        addToppingItem("Waffle", "Syrup");
        addMenuItem(ChickenFactory.getInstance().getFood(3.00, "Chicken Strips", DietaryRestriction.DietPlan.PALEO));
        addToppingItem("Chicken Strips", "BBQ");

        // Adding Carbs menu item
        addMenuItem(PastaFactory.getInstance().getFood(2.50, "HashBrowns", DietaryRestriction.DietPlan.VEGAN));
        addToppingItem("HashBrowns", "");

        // Adding Fats menu item
        addMenuItem(AvocadoFactory.getInstance().getFood(2.00, "Tuna", DietaryRestriction.DietPlan.NUT_ALLERGY));
        addToppingItem("Tuna", "Lemon");
    }

    @Override
    public void addToppingItem(String foodName, String toppingName) {
        Topping addition;
        Food existingMenuItem = getFoodByName(foodName);
        String newToppingName = toppingName + " " + existingMenuItem.getName();

        addition = switch (toppingName) {
            case "Syrup" -> new Syrup(existingMenuItem, newToppingName, 1.00);
            case "BBQ" -> new BBQ(existingMenuItem, newToppingName, 1.00);
            case "Lemon" -> new Lemon(existingMenuItem, newToppingName, 1.00);
            default -> null;
        };

        super.getRestaurantMenu().addToppingItem(addition);
    }
}
