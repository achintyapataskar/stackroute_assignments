//Write a java program to calculate first and last date of a week.
//        Output:
//        First Date of Week:             Mon 24/07/2017
//        Last date of the week:          Sun 30/07/2017

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Week {
    public String PrintDate(Calendar c) {
        String answer = "";
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        return df.format(c.getTime());
    }
    public static void main(String []args){
        Calendar c = Calendar.getInstance();
        Week w = new Week();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        System.out.println(w.PrintDate(c));
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        System.out.println(w.PrintDate(c));
    }
}
