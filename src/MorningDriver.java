public class MorningDriver extends Driver
{
    public MorningDriver(String name, String address,
                           County.Area operatingCounty, int shiftStartHour, int shiftEndHour)
    {
        super(name, address, operatingCounty, shiftStartHour, shiftEndHour);
    }

    @Override
    void pickupFood(Order order)
    {
        System.out.println("Morning order picked up.");
    }

    @Override
    void deliverFood(Order order)
    {
        System.out.println("Morning order delivered.");
    }
}
