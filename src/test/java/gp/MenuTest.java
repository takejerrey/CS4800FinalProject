package test.java.gp;

import main.java.gp.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest
{
    Menu menu = new Menu();
    Food burger = new Burger(1.00, "B",
            new Carb("C"), new Protein("P"), new Fat("F"), BurgerFactory.getInstance());
    Topping topping = new Cheese(burger, "CB", 1.00);


    @BeforeEach
    void setUp()
    {
        menu.addMenuItem(burger);
        menu.addToppingItem(topping);
    }

    @Test
    void addMenuItem()
    {
        assertTrue(menu.getMenuItems().contains(burger));
    }

    @Test
    void orderMenuItem()
    {
        Food food = menu.orderMenuItem("B");
        assertEquals(burger, food);
    }

    @Test
    void addToppingItem()
    {
        assertTrue(menu.getExtraToppings().contains(topping));
    }

    @Test
    void addTopping()
    {
        Food food = menu.addTopping("CB");
        assertEquals(topping, food);
    }
}