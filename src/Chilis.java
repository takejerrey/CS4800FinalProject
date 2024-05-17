public class Chilis extends Restaurant
{
    public Chilis(String name, String address, County.Area operatingCounty, int openingHour, int closingHour, String cuisineType)
    {
        super(name, address, operatingCounty, openingHour, closingHour, cuisineType);

        addMenuItem(BurgerFactory.getInstance().getFood(1.00, "Burger", DietaryRestriction.DietPlan.NO_RESTRICTION));
        addToppingItem("Burger", "Cheese");
        addToppingItem("Burger", "Bacon");

        addMenuItem(ChickenFactory.getInstance().getFood(3.00, "Chicken Strips", DietaryRestriction.DietPlan.PALEO));
        addToppingItem("Chicken Strips", "BBQ");
    }

    @Override
    public void addToppingItem(String foodName, String toppingName)
    {
        Topping addition = null;
        Food existingMenuItem = getFoodByName(foodName);
        String newToppingName = toppingName + " " + existingMenuItem.getName();

        addition = switch (toppingName)
        {
            case "Cheese" -> new Cheese(existingMenuItem, newToppingName, 1.00);
            case "Bacon" -> new Bacon(existingMenuItem, newToppingName, 1.50);
            case "BBQ" -> new BBQ(existingMenuItem, newToppingName, 1.00);
            default -> null;
        };

        super.getRestaurantMenu().addToppingItem(addition);
    }
}
