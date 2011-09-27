package utilities;

import java.util.Date;

public class Timer {
   
    public void setTimer(){
        Date prev = new Date();
        Cache.setStartTime(prev.getTime());
    }
    public long getTime(){
        Date now = new Date();
        long curTime = now.getTime();
        long inter = curTime - Cache.getStartTime();
        
        return inter;
    }
}
