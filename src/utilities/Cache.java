package utilities;

import java.util.LinkedList;

import entities.Flights;
import entities.Statistics;

public class Cache {
    private static LinkedList<Flights> flights;
    private static LinkedList<Statistics> flightStats;
    private static long startTime=0L;
   
    public Cache(){
        flights = new LinkedList<Flights>();
        flightStats = new LinkedList<Statistics>();
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
    public static LinkedList<Statistics> getFlightStats(){
        return flightStats;
    }
}
