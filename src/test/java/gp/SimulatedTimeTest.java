package test.java.gp;

import main.java.gp.SimulatedTime;
import main.java.gp.TimeStamp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Reminder that SimulatedTime is initialized at 8 hours, 0 minutes;
 */
class SimulatedTimeTest
{

    @BeforeEach
    void setUp()
    {
        SimulatedTime.resetInstance();
    }

    @Test
    void updateValidTime()
    {
        TimeStamp beforeTime = SimulatedTime.getInstance().toTimeStamp();
        SimulatedTime.getInstance().updateTime();
        TimeStamp afterTime = SimulatedTime.getInstance().toTimeStamp();

        int beforeMinutes = beforeTime.getHour() * 60 + beforeTime.getMinutes();
        int afterMinutes = afterTime.getHour() * 60 + afterTime.getMinutes();
        int minuteDifference = afterMinutes - beforeMinutes;

        assertEquals(15, minuteDifference);
    }

    @Test
    void setTime()
    {
        TimeStamp beforeTime = SimulatedTime.getInstance().toTimeStamp();
        SimulatedTime.getInstance().setTime(9, 0);
        TimeStamp afterTime = SimulatedTime.getInstance().toTimeStamp();

        int beforeMinutes = beforeTime.getHour() * 60 + beforeTime.getMinutes();
        int afterMinutes = afterTime.getHour() * 60 + afterTime.getMinutes();
        int minuteDifference = afterMinutes - beforeMinutes;

        assertEquals(60, minuteDifference);
    }

    @Test
    void setInvalidTime()
    {
        SimulatedTime.getInstance().setTime(9999, 9999);

        assertEquals(0, SimulatedTime.getInstance().getHour());
        assertEquals(0, SimulatedTime.getInstance().getMinutes());
    }
}