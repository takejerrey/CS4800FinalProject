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

    public void updateTime()
    {
        minutes += 10;

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
}
