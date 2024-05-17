public class TimeStamp
{
    private final int hour;
    private final int minutes;

    public TimeStamp(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minutes);
    }

    public int getHour()
    {
        return hour;
    }

    public int getMinutes()
    {
        return minutes;
    }

    public static boolean isWithinRange(TimeStamp time, TimeStamp start, TimeStamp end)
    {
        int timeInMinutes = time.hour * 60 + time.minutes;
        int startInMinutes = start.hour * 60 + start.minutes;
        int endInMinutes = end.hour * 60 + end.minutes;

        if (startInMinutes <= endInMinutes)
        {
            return startInMinutes <= timeInMinutes && timeInMinutes <= endInMinutes;
        }

        // Handles midnight cases
        else
        {
            return startInMinutes <= timeInMinutes || timeInMinutes <= endInMinutes;
        }
    }
}
