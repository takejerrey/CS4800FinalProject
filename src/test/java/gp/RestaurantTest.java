package test.java.gp;

import main.java.gp.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest
{
    Restaurant r1 = new Chilis("Chili's", "001", County.Area.LA_COUNTY, 8, 20, "Tex-Mex");
    Food burger = new Burger(1.00, "B",
            new Carb("C"), new Protein("P"), new Fat("F"), BurgerFactory.getInstance());
    Topping topping = new Cheese(burger, "CB", 1.00);

    @Test
    void getFoodByName()
    {
        assertInstanceOf(Burger.class, r1.getFoodByName("Burger"));
    }

    @Test
    void addMenuItem()
    {
        r1.addMenuItem(burger);
        assertTrue(r1.getRestaurantMenu().getMenuItems().contains(burger));
    }

    @Test
    void addToppingItem()
    {
        r1.addToppingItem("Burger", "Cheese");
        assertInstanceOf(Cheese.class, r1.getFoodByName("Cheese Burger"));
    }
}