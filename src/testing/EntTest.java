/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import entities.*;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author antonis
 */
public class EntTest {
    public static void main(String args[]){
        Booking newBook = new Booking("F58476", "Antonis", "Kouzoupis", 211234567
                , "Skata 17");
        System.out.println(newBook);
        
        Date depTime = new GregorianCalendar(2011, 7, 20, 14, 21).getTime();
        Date arrTime = new GregorianCalendar(2011, 7, 20, 16, 10).getTime();
        Flights newFlight = new Flights("d", "Athens", "London", depTime, arrTime);
        System.out.println(newFlight);
    }
}
