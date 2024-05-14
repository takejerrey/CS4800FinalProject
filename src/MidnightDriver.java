public class MidnightDriver extends Driver
{
    public MidnightDriver(String name, String address,
                         County.Area operatingCounty,DriverTimeShift.Shift workShift)
    {
        super(name, address, operatingCounty, workShift);
    }

    @Override
    void deliverFood(Order order)
    {
        System.out.println("Midnight order delivered.");
    }
}
