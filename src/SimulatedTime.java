public class SimulatedTime
{
    private static SimulatedTime instance;
    private int hour;
    private int minutes;

    private SimulatedTime()
    {
        hour = 8;
        minutes = 0;
    }

    public static SimulatedTime getInstance()
    {
        if (instance == null)
        {
            instance = new SimulatedTime();
        }

        return instance;
    }

    /**
     * Increments time by 15 minutes.
     * Minutes are always within 0-60.
     * Hours are always within 0-24.
     */
    public void updateTime()
    {
        minutes += 15;

        if (minutes >= 60)
        {
            minutes -= 60;
            hour++;

            if (hour >= 24)
            {
                hour = 0;
            }
        }
    }

    public int getHour()
    {
        return hour;
    }

    public int getMinutes()
    {
        return minutes;
    }

    @Override
    public String toString()
    {
        return String.format("SYSTEM TIME: [%02d:%02d]", hour, minutes);
    }

    public TimeStamp toTimeStamp()
    {
        return new TimeStamp(hour, minutes);
    }
}
