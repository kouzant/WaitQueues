package business;

import java.util.LinkedList;
import java.util.Iterator;

import utilities.Cache;
import entities.Flights;
import entities.Statistics;
import entities.Bookings;

public class Compute {
    public void init(){
        LinkedList<Flights> flights = Cache.getFList();
        LinkedList<Statistics> flightStats = Cache.getFlightStats();
        Iterator<Flights> flightsIt = flights.iterator();
        
        while(flightsIt.hasNext()){
            Statistics tmpStat = new Statistics(flightsIt.next().getFlightCode());
            flightStats.add(tmpStat);
        }
    }
    
    public void stabilize(String flightCode){
        LinkedList<Flights> flights = Cache.getFList();
        Iterator<Flights> flightsIt = flights.iterator();
        LinkedList<Statistics> fStats = Cache.getFlightStats();
        Iterator<Statistics> fStatsIt = fStats.iterator();
        
        Flights flight=null;
        while(flightsIt.hasNext()){
            flight = flightsIt.next();
            if(flight.getFlightCode().equals(flightCode))
                break;
            else
                flight = null;
        }
        
        Statistics stats = null;
        while(fStatsIt.hasNext()){
            stats = fStatsIt.next();
            if(stats.getFlightCode().equals(flightCode))
                break;
            else
                stats = null;
        }
        
        stats.setLq(flight.getAwaiting().size());
        Iterator<Bookings> bList = flight.getBookings().iterator();
        Iterator<Bookings> wList = flight.getAwaiting().iterator();
       long totalServTime = 0L;
       int customers=0;
       
       while(bList.hasNext()){
           totalServTime = totalServTime+bList.next().getBookServTime();
           customers++;
       }
       while(wList.hasNext()){
           totalServTime = totalServTime+wList.next().getBookServTime();
           customers++;
       }
       long m = totalServTime/customers;
       
       stats.setM(m);
    }
}
