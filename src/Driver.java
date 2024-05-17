public abstract class Driver
{
    private String name;
    private String address;
    private County.Area operatingCounty;
    private TimeStamp shiftStart;
    private TimeStamp shiftEnd;

    public Driver(String name, String address, County.Area operatingCounty, int shiftStartHour, int shiftEndHour)
    {
        this.name = name;
        this.address = address;
        this.operatingCounty = operatingCounty;
        this.shiftStart = new TimeStamp(shiftStartHour, 0);
        this.shiftEnd = new TimeStamp(shiftEndHour, 0);
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

    public TimeStamp getShiftStart()
    {
        return shiftStart;
    }

    public void setShiftStart(TimeStamp shiftStart)
    {
        this.shiftStart = shiftStart;
    }

    public TimeStamp getShiftEnd()
    {
        return shiftEnd;
    }

    public void setShiftEnd(TimeStamp shiftEnd)
    {
        this.shiftEnd = shiftEnd;
    }
}
