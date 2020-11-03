package rtnk.springframework.blog.currenttime;

import org.junit.Test;


public class CurrentTimeDateCalendarTest {

    @Test
    public void testGetCurrentTimeUsingDate() throws Exception {
        CurrentTimeDateCalendar.getCurrentTimeUsingDate();

    }

    @Test
    public void testGetCurrentTimeUsingCalendar() throws Exception {
        CurrentTimeDateCalendar.getCurrentTimeUsingCalendar();
    }
}