public abstract class Driver
{
    private String name;
    private String address;
    private County.Area operatingCounty;
    private DriverTimeShift.Shift workShift;

    public Driver(String name, String address, County.Area operatingCounty, DriverTimeShift.Shift workShift)
    {
        this.name = name;
        this.address = address;
        this.operatingCounty = operatingCounty;
        this.workShift = workShift;
    }

    abstract void deliverFood(Order order);

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public County.Area getOperatingCounty()
    {
        return operatingCounty;
    }

    public void setOperatingCounty(County.Area operatingCounty)
    {
        this.operatingCounty = operatingCounty;
    }

    public DriverTimeShift.Shift getWorkShift()
    {
        return workShift;
    }

    public void setWorkShift(DriverTimeShift.Shift workShift)
    {
        this.workShift = workShift;
    }
}
