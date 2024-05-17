public class MidnightDriver extends Driver
{
    public MidnightDriver(String name, String address,
                           County.Area operatingCounty, int shiftStartHour, int shiftEndHour)
    {
        super(name, address, operatingCounty, shiftStartHour, shiftEndHour);
    }

    @Override
    void pickupFood(Order order)
    {
        System.out.println("Midnight order picked up.");
    }

    @Override
    void deliverFood(Order order)
    {
        System.out.println("Midnight order delivered.");
    }
}
