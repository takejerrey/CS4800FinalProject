public class MorningDriver extends Driver
{
    public MorningDriver(String name, String address,
                         County.Area operatingCounty,DriverTimeShift.Shift workShift)
    {
        super(name, address, operatingCounty, workShift);
    }

    @Override
    void deliverFood(Order order)
    {
        System.out.println("Morning order delivered.");
    }
}
