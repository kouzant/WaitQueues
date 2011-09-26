package utilities;

import java.util.Calendar;
import java.util.Date;

public class Timer {
    private static long startTime;
    
    public Timer(){
        Calendar cal = Calendar.getInstance();
        startTime = cal.getTime().getTime();
    }
    
    public static long getTime(){
        Calendar cal = Calendar.getInstance();
        long curTime = cal.getTime().getTime();
        
        return curTime - startTime;
    }
}
