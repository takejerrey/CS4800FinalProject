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
}
