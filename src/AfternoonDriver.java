public class AfternoonDriver extends Driver
{
    public AfternoonDriver(String name, String address,
                         County.Area operatingCounty,DriverTimeShift.Shift workShift)
    {
        super(name, address, operatingCounty, workShift);
    }

    @Override
    void deliverFood(Order order)
    {
        System.out.println("Afternoon order delivered.");
    }
}
