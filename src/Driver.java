public abstract class Driver
{
    private String name;
    private String address;
    private County operatingCounty;
    private DriverTimeShift shift;

    abstract void deliverFood(Order order);
}
