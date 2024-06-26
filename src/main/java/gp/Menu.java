package main.java.gp;

import java.util.ArrayList;

public class Menu {
    private final ArrayList<Food> menuItems;
    private final ArrayList<Topping> extraToppings;

    public Menu() {
        menuItems = new ArrayList<Food>();
        extraToppings = new ArrayList<Topping>();
    }

    public void addMenuItem(Food item) {
        menuItems.add(item);
    }

    public Food orderMenuItem(String item) {
        for (Food menuItem : menuItems)
        {
            if (menuItem.getName().equals(item))
            {
                return menuItem;
            }
        }
        return null;
    }

    public void addToppingItem(Topping item) {
        extraToppings.add(item);
    }

    public Food addTopping(String item) {
        for(int i = 0; i < menuItems.size(); i++) {
            if(extraToppings.get(i).getName().equals(item)) {
                return extraToppings.get(i);
            }
        }
        return null;
    }

    public ArrayList<Food> getMenuItems()
    {
        return menuItems;
    }

    public ArrayList<Topping> getExtraToppings()
    {
        return extraToppings;
    }
}
