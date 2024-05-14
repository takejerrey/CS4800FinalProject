public class DriverFactory
{
    public static Driver getDriver(String name, String address,
                                   County.Area operatingCounty, DriverTimeShift.Shift workShift)
    {
        return switch (workShift)
        {
            case MORNING -> new MorningDriver(name, address, operatingCounty, workShift);
            case AFTERNOON -> new AfternoonDriver(name, address, operatingCounty, workShift);
            case MIDNIGHT -> new MidnightDriver(name, address, operatingCounty, workShift);
        };
    }
}
