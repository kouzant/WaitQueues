/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import entities.Flights;
import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;
import utilities.*;

/**
 *
 * @author antonis
 */
public class ParserTest {
    public static void main(String args[]){
        new Cache();
        ConfigParser cp = new ConfigParser();
        String file1 = cp.getFile("file1");
        new Timer();
        
        //Create the flights
        Date departureDate = new GregorianCalendar(2011,04,15,18,15).getTime();
        Date arrivalDate = new GregorianCalendar(2011,04,15,21,00).getTime();
        Flights flight=new Flights("EZY1234", "Athens", "London", departureDate, arrivalDate,
                100, 1);
        Cache.addFlight(flight);
        flight=new Flights("EZY1235", "Athens", "London", departureDate, arrivalDate,
                100, 0);
        Cache.addFlight(flight);

        flight=new Flights("EZY1236", "Athens", "London", departureDate, arrivalDate,
                100, 50);
        Cache.addFlight(flight);


        BookParser bp = new BookParser(file1);
        bp.parseBooks();
    }
}
