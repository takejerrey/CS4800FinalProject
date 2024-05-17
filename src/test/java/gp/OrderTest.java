package test.java.gp;

import main.java.gp.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest
{
    Restaurant r1 = new Chilis("Chili's", "001", County.Area.LA_COUNTY, 8, 20, "Tex-Mex");
    Driver d1 = DriverFactory.getDriver("D1", "101", County.Area.LA_COUNTY, 8, 16);
    Customer c1 = new Customer("C4", "204", County.Area.LA_COUNTY, DietaryRestriction.DietPlan.NO_RESTRICTION);
    Order order = new Order(r1, c1, d1);

    Food burger = new Burger(1.00, "B",
            new Carb("C"), new Protein("P"), new Fat("F"), BurgerFactory.getInstance());

    @BeforeEach
    void setUp()
    {
        order.addFood(burger);
    }

    @Test
    void addFood()
    {
        assertTrue(order.getFoodItems().contains(burger));
    }

    @Test
    void getTotalOrderCost()
    {
        assertEquals(1.00, order.getTotalOrderCost());
    }
}