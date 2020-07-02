package ar.edu.fi.algo3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class NotificationTest {
    @Test
    public void testNotificationComparisionEquality() {
        assertEquals( new Notification("message"), new Notification("message"));
    }

    @Test
    public void testNotificationComparisionDifferences() {


        assertNotEquals(new Notification("message"), new Object());
    }
}
