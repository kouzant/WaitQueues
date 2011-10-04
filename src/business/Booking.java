package business;

import java.util.LinkedList;
import java.util.Iterator;

import entities.Bookings;
import entities.Flights;
import utilities.Cache;
import utilities.Timer;
import utilities.Hash;
import utilities.Writer;

public class Booking {

    private LinkedList<Bookings> customers;

    public String book(String id, String passportID, String firstName,
            String lastName, long phNumber, String address, String flightCode,
            long cardSerial, int cardCode, long delay, long curTime) {
        LinkedList<Flights> flights = Cache.getFList();
        Iterator<Flights> FList = flights.iterator();
        Flights tmpFlight = null;
        Flights flight = null;
        while (FList.hasNext()) {
            tmpFlight = FList.next();
            if (tmpFlight.getFlightCode().equals(flightCode)) {
                flight = tmpFlight;
                break;
            }
        }
        Hash hash = new Hash();
        String bookID = hash.MD5(id.concat(flightCode));
        Bookings newCustomer = new Bookings(id, passportID, firstName, lastName,
                phNumber, address, flightCode, cardSerial,
                cardCode, delay, bookID);
        newCustomer.setArrTime(curTime);
        if (flight.getAvailability()) {
            flight.getBookings().add(newCustomer);
            flight.decrAvail();
            flight.incrNBookList();
        } else {
            Timer timer = new Timer();
            newCustomer.setBookWaitStart(timer.getTime());
            flight.getAwaiting().add(newCustomer);
            flight.incrNWaitList();
        }
        Writer writer = Cache.getWrite();
        writer.writeString("Flight Code: "+flightCode);
        writer.writeString("Booking Code: "+bookID);
        writer.writeString("--------------------");
        Cache.addCustomer(newCustomer);
        Compute compute = new Compute();
        //compute.computeM(flightCode);
        //compute.computel(flightCode);
        compute.update(flightCode);
        return bookID;
    }

    public void printCustomers() {
        LinkedList<Flights> flights = Cache.getFList();
        Iterator<Flights> FList = flights.iterator();
        while (FList.hasNext()) {
            Flights flight = FList.next();
            System.out.println(flight);
            System.out.println("--Booking list--");
            System.out.println(flight.getBookings());
            System.out.println("--Awaiting list--");
            System.out.print(flight.getAwaiting());
        }
    }
}
