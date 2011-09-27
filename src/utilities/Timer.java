package utilities;

import java.util.Calendar;
import java.util.Date;

public class Timer {
    private static long startTime;
    
    public Timer(){
        Date now = new Date();
        startTime = now.getTime();
    }
    
    public static long getTime(){
        Date now = new Date();
        long curTime = now.getTime();
        long inter = curTime-startTime;
        
        return inter;
    }
}
