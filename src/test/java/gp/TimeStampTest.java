package test.java.gp;

import main.java.gp.TimeStamp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeStampTest
{

    @Test
    void isWithinRange()
    {
        TimeStamp timeToCheck = new TimeStamp(10, 0);
        TimeStamp startTime = new TimeStamp(8, 0);
        TimeStamp endTime = new TimeStamp(12, 0);

        assertTrue(TimeStamp.isWithinRange(timeToCheck, startTime, endTime));
    }

    @Test
    void isNotWithinRange()
    {
        TimeStamp timeToCheck = new TimeStamp(16, 0);
        TimeStamp startTime = new TimeStamp(8, 0);
        TimeStamp endTime = new TimeStamp(12, 0);

        assertFalse(TimeStamp.isWithinRange(timeToCheck, startTime, endTime));
    }
}