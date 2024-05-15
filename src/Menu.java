import java.util.ArrayList;

public abstract class Menu {
    private ArrayList<Food> menuItems;
    private ArrayList<Topping> extraToppings;

    public Menu() {
        menuItems = new ArrayList<Food>();
        extraToppings = new ArrayList<Topping>();
    }

    public void addMenuItem(Food item) {
        menuItems.add(item);
    }

    public Food orderMenuItem(String item) {
        for(int i = 0; i < menuItems.size(); i++) {
            if(menuItems.get(i).getName().equals(item)) {
                return menuItems.get(i);
            }
        }
        return null;
    }

    public void addTopping(Topping item) {
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
}
