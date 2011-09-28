package business;

import java.util.LinkedList;
import java.util.Iterator;

import utilities.Cache;
import entities.Flights;
import entities.Statistics;
import entities.Bookings;
import java.text.DecimalFormat;

public class Compute {
    private LinkedList<Bookings> customers;
    private LinkedList<Statistics> stats;
    
    public Compute(){
        customers = Cache.getCustomers();
        stats = Cache.getFlightStats();
    }
    
    public void computeM(String flightCode){
        Iterator<Bookings> custIt = customers.iterator();
        int nCust = 0;
        long totalServTime = 0L;
        long m = 0L;
        
        while(custIt.hasNext()){
            Bookings customer = custIt.next();
            if(customer.getFlightCode().equals(flightCode)){
                totalServTime = totalServTime + customer.getBookServTime();
                nCust++;
            }
        }
        
        m = totalServTime / nCust;
        
        Statistics stat = getFStat(flightCode);
        stat.setM(m);
        System.out.println("m: "+m);
    }
    
    public void computel(String flightCode){
        System.out.println(flightCode);
        Iterator<Bookings> custIt = customers.iterator();
        LinkedList<Long> servTimes = new LinkedList<Long>();
        long servTimeInter = 0L;
        int nCust = 0;
        long meanServTimeInter = 0;
        
        while(custIt.hasNext()){
            Bookings cust = custIt.next();
            if(cust.getFlightCode().equals(flightCode)){
                servTimes.add(cust.getBookServTime());
                nCust++;
            }
        }
        
        if(servTimes.size() == 1){
            servTimeInter = servTimeInter + servTimes.get(0);
        }else if (servTimes.size() == 0){
            System.out.println("No customers");
            nCust = 1;
            meanServTimeInter = 1;
        }else {
            System.err.println("skjhf: "+servTimes.size());
            for(int i=0;i<(servTimes.size()-1);i++){
                long diff = servTimes.get(i+1) - servTimes.get(i);
                servTimeInter = servTimeInter + diff;
            }
        }
        
        meanServTimeInter = servTimeInter / nCust;
        //one hour is 3600000 ms
        long l = 3600000 / meanServTimeInter;
       
       Statistics stat = getFStat(flightCode);
       stat.setl(l);
       System.err.println("l/h: "+l);
    }
    
    private Statistics getFStat(String flightCode){
        Iterator<Statistics> statsIt = stats.iterator();
        Statistics stat = null;
        while(statsIt.hasNext()){
            stat = statsIt.next();
            if(stat.getFlightCode().equals(flightCode))
                break;
            else
                stat = null;
        }
        
        return stat;
    }
    public void update(String flightCode){
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
        stats.setLs(flight.getBookings().size());
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

       if(bSize == 0)
           servTimeInter = 0;
        else if(bSize == 1) {
            servTimeInter = servTimeInter + bList.get(0).getBookServTime();
        } else {
            for (int i = 0; i < (bSize-1); i++) {
                long diff = bList.get(i + 1).getBookServTime()
                        - bList.get(i).getBookServTime();
                servTimeInter = servTimeInter + diff;
            }
        }
        if (wSize == 1) {
            servTimeInter = servTimeInter + wList.get(0).getBookServTime();
        } else if (wSize > 1){
            for (int i = 0; i < (wSize-1); i++) {
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
       Long ll = new Long(l);
       Long ml = new Long(m);
       float lf = ll.floatValue();
       float mf = ml.floatValue();
       float r = lf/mf;
       DecimalFormat df = new DecimalFormat("#.###");
       stats.setR(df.format(r));
    }
    
    public void printStats(){
        LinkedList<Statistics> stats = Cache.getFlightStats();
        Iterator<Statistics> statsIt = stats.iterator();
        while(statsIt.hasNext()){
            System.out.println(statsIt.next());
        }
    }
}
