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
        LinkedList<Bookings> bList = flight.getBookings();
        LinkedList<Bookings> wList = flight.getAwaiting();
        Iterator<Bookings> bListIt = bList.iterator();
        Iterator<Bookings> wListIt = wList.iterator();
       long totalServTime = 0L;
       int customers=0;
       
       while(bListIt.hasNext()){
           totalServTime = totalServTime+bListIt.next().getBookServTime();
           customers++;
       }
       while(wListIt.hasNext()){
           totalServTime = totalServTime+wListIt.next().getBookServTime();
           customers++;
       }
       long m = totalServTime/customers;
       System.err.println("m: "+m);
       stats.setM(m);
       
       int bSize = bList.size();
       int wSize = wList.size();
       long servTimeInter=0L;
       
        if (bSize == 1) {
            servTimeInter = servTimeInter + bList.get(0).getBookServTime();
        } else {
            for (int i = 0; i < bSize; i++) {
                long diff = bList.get(i + 1).getBookServTime()
                        - bList.get(i).getBookServTime();
                servTimeInter = servTimeInter + diff;
            }
        }
        if (wSize == 1) {
            servTimeInter = servTimeInter + wList.get(0).getBookServTime();
        } else {
            for (int i = 0; i < wSize; i++) {
                long diff = wList.get(i + 1).getBookServTime()
                        - wList.get(i).getBookServTime();
                servTimeInter = servTimeInter + diff;
            }
        }
       long meanServInter = servTimeInter / (bList.size() + wList.size());
       //one hour is 3600000 ms
       long l = 3600000 / meanServInter;
       System.err.println("l/h: "+l);
       stats.setl(l);
    }
}
