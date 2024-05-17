package test.java.gp;

import main.java.gp.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverFactoryTest
{

    @Test
    void getMorningDriver()
    {
        Driver driver = DriverFactory.getDriver("D1", "201", County.Area.LA_COUNTY, 8, 16);
        assertInstanceOf(MorningDriver.class, driver);
    }

    @Test
    void getAfternoonDriver()
    {
        Driver driver = DriverFactory.getDriver("D1", "201", County.Area.LA_COUNTY, 16, 0);
        assertInstanceOf(AfternoonDriver.class, driver);
    }

    @Test
    void getMidnightDriver()
    {
        Driver driver = DriverFactory.getDriver("D1", "201", County.Area.LA_COUNTY, 0, 8);
        assertInstanceOf(MidnightDriver.class, driver);
    }
}