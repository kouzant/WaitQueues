package utilities;

import entities.Flights;
import java.util.LinkedList;

public class Cache {
    private static LinkedList<Flights> flights;
   
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
}
