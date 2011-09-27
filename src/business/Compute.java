package business;

import java.util.LinkedList;
import java.util.Iterator;

import utilities.Cache;
import entities.Flights;
import entities.Statistics;

public class Compute {
    public Compute(){
        LinkedList<Flights> flights = Cache.getFList();
        LinkedList<Statistics> flightStats = Cache.getFlightStats();
        Iterator<Flights> flightsIt = flights.iterator();
        
        while(flightsIt.hasNext()){
            Statistics tmpStat = new Statistics(flightsIt.next().getFlightCode());
            flightStats.add(tmpStat);
        }
    }
}
