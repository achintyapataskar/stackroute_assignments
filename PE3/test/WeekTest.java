import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.junit.Assert.*;

public class WeekTest {
    @Test
    public void PrintDate() {
        Calendar c = Calendar.getInstance();
        Week w = new Week();
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        assertEquals(df.format(c.getTime()), w.PrintDate(c));
    }

    @Test
    public void PrintFirstDate() {
        Calendar c = Calendar.getInstance();
        Week w = new Week();
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        assertEquals(df.format(c.getTime()), w.PrintDate(c));
    }
    @Test
    public void PrintLastDate() {
        Calendar c = Calendar.getInstance();
        Week w = new Week();
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        assertEquals(df.format(c.getTime()), w.PrintDate(c));
    }
}