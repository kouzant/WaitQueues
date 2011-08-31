package business;

import java.util.LinkedList;
import java.util.Iterator;

import entities.Bookings;
import utilities.Lists;

public class Booking {
    private LinkedList<Bookings> customers;
    
    public Booking(){
        customers = Lists.getCustomers();
    }
    
    public void book(String id, String passportID, String firstName,
            String lastName, long phNumber, String address, String flightCode,
            long cardSerial, int cardCode){
        Bookings newCustomer = new Bookings(id, passportID, firstName, lastName,
                                    phNumber, address, flightCode, cardSerial,
                                    cardCode);
        customers.add(newCustomer);
    }
    public void printCustomers(){
        Iterator<Bookings> cust = customers.iterator();
        while(cust.hasNext()){
            System.out.println(cust.next());
        }
    }
}
