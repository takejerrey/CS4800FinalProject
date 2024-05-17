package main.java.gp;

public class DriverFactory
{
    public static Driver getDriver(String name, String address,
                                   County.Area operatingCounty, int shiftStartHour, int shiftEndHour)
    {
        if (shiftStartHour >= 8 && shiftStartHour < 16)
        {
            return new MorningDriver(name, address, operatingCounty, shiftStartHour, shiftEndHour);
        }

        else if (shiftStartHour >= 16)
        {
            return new AfternoonDriver(name, address, operatingCounty, shiftStartHour, shiftEndHour);
        }

        else
        {
            return new MidnightDriver(name, address, operatingCounty, shiftStartHour, shiftEndHour);
        }
    }
}
