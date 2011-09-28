package utilities;

import java.util.GregorianCalendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.Iterator;

import entities.Flights;
import entities.Statistics;

public class InitFlights {
    public InitFlights(){
        new Cache();
        
        Date depTime = new GregorianCalendar(2011,9,20,9,00).getTime();
        Date arrTime = new GregorianCalendar(2011,9,20,12,00).getTime();
        Flights newFlight = new Flights("EZY1234", "Athens", "Thessaloniki",
                depTime, arrTime, 20, 10);
        Cache.addFlight(newFlight);
        
        depTime = new GregorianCalendar(2011,9,28,21,00).getTime();
        arrTime = new GregorianCalendar(2011,9,28,00,00).getTime();
        newFlight = new Flights("EZY2234", "Athens", "Thessaloniki", depTime,
                arrTime, 20, 15);
        Cache.addFlight(newFlight);
        
        depTime = new GregorianCalendar(2011,9,22,10,45).getTime();
        arrTime = new GregorianCalendar(2011,9,22,13,45).getTime();
        newFlight = new Flights("EZY3234", "Thessaloniki", "Athens", 
                depTime, arrTime, 20, 10);
        Cache.addFlight(newFlight);
        
        depTime = new GregorianCalendar(2011,9,30,23,10).getTime();
        arrTime = new GregorianCalendar(2011,9,30,23,50).getTime();
        newFlight = new Flights("EZY4234", "Thessaloniki", "Athens", depTime,
                arrTime, 20, 5);
        Cache.addFlight(newFlight);
        
        depTime = new GregorianCalendar(2011,9,23,10,00).getTime();
        arrTime = new GregorianCalendar(2011,9,23,13,00).getTime();
        newFlight = new Flights("EZY5234", "Athens", "Rhodes", depTime, arrTime,
                20, 10);
        Cache.addFlight(newFlight);
        
        depTime = new GregorianCalendar(2011,9,25,12,00).getTime();
        arrTime = new GregorianCalendar(2011,9,25,15,00).getTime();
        newFlight = new Flights("EZY6234", "Athens", "Rhodes", depTime, arrTime,
                20, 11);
        Cache.addFlight(newFlight);
        
        depTime = new GregorianCalendar(2011,9,26,9,00).getTime();
        arrTime = new GregorianCalendar(2011,9,26,12,00).getTime();
        newFlight = new Flights("EZY7234", "Rhodes", "Athens", depTime, arrTime,
                20, 13);
        Cache.addFlight(newFlight);
        
        depTime = new GregorianCalendar(2011,9,26,15,00).getTime();
        arrTime = new GregorianCalendar(2011,9,26,18,00).getTime();
        newFlight = new Flights("EZY8234", "Rhodes", "Athens", depTime, arrTime,
                20, 5);
        Cache.addFlight(newFlight);
        
        depTime = new GregorianCalendar(2011,9,20,10,00).getTime();
        arrTime = new GregorianCalendar(2011,9,20,13,00).getTime();
        newFlight = new Flights("EZY9234", "Rhodes", "Thessaloniki", depTime,
                arrTime, 20, 2);
        Cache.addFlight(newFlight);
        
        depTime = new GregorianCalendar(2011,9,20,11,00).getTime();
        arrTime = new GregorianCalendar(2011,9,20,14,00).getTime();
        newFlight = new Flights("EZY9234", "Thessaloniki", "Rhodes", depTime,
                arrTime, 20, 18);
        Cache.addFlight(newFlight);        
    }
    
    public static void initStats(){
        LinkedList<Flights> flights = Cache.getFList();
        LinkedList<Statistics> flightStats = Cache.getFlightStats();
        Iterator<Flights> flightsIt = flights.iterator();
        
        while(flightsIt.hasNext()){
            Statistics tmpStat = new Statistics(flightsIt.next().getFlightCode());
            flightStats.add(tmpStat);
        }
    }
}