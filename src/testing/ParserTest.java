package testing;

import java.util.Date;
import java.util.GregorianCalendar;

import entities.Flights;
import utilities.*;

public class ParserTest {
    public static void main(String args[]){
        new Cache();
        ConfigParser cp = new ConfigParser();
        String file1 = cp.getFile("file1");
        Timer timer = new Timer();
        timer.setTimer();
        
        //Create the flights
        Date departureDate = new GregorianCalendar(2011,04,15,18,15).getTime();
        Date arrivalDate = new GregorianCalendar(2011,04,15,21,00).getTime();
        Flights flight=new Flights("EZY2234", "Athens", "London", departureDate, arrivalDate,
                100, 1);
        Cache.addFlight(flight);
        flight=new Flights("EZY1235", "Athens", "London", departureDate, arrivalDate,
                100, 0);
        Cache.addFlight(flight);

        flight=new Flights("EZY1236", "Athens", "London", departureDate, arrivalDate,
                100, 50);
        Cache.addFlight(flight);
        
        InitFlights.initStats();
        BookParser bp = new BookParser(file1);
        bp.parseBooks();
        
    }
}
