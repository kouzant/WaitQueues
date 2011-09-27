package utilities;

import entities.Flights;
import java.util.LinkedList;

public class Cache {
    private static LinkedList<Flights> flights;
    private static long startTime=0L;
   
    public Cache(){
        flights = new LinkedList<Flights>();
    }
    public static void addFlight(Flights flight){
        flights.add(flight);
    }
    public static LinkedList<Flights> getFList(){
        return flights;
    }
    public static Flights getFlight(int index){
        return flights.get(index);
    }
    public static void setStartTime(long startTimeAr){
        startTime = startTimeAr;
    }
    public static long getStartTime(){
        return startTime;
    }
}
