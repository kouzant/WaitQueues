package business;

import java.util.LinkedList;
import java.util.Iterator;

import entities.Flights;
import entities.Bookings;
import utilities.Cache;

public class CancelBook {

    private String bookID;
    private String flightCode;

    public CancelBook(String bookID, String flightCode) {
        this.bookID = bookID;
        this.flightCode = flightCode;
        boolean deleted = delete();
        Cache.setDeleted(deleted);
    }

    private Flights getFlight() {
        LinkedList<Flights> fList = Cache.getFList();
        Iterator<Flights> fListIt = fList.iterator();
        Flights indexF = null;
        while (fListIt.hasNext()) {
            Flights tmpFlight = fListIt.next();
            if (tmpFlight.getFlightCode().equals(flightCode)) {
                indexF = tmpFlight;
                break;
            }
        }

        return indexF;
    }

    public boolean delete() {
        Flights flight = getFlight();
        boolean found = false;
        if (flight != null) {
            //search the boarding list
            LinkedList<Bookings> custLists = flight.getBookings();
            Iterator<Bookings> listIt = custLists.iterator();
            int index = 0;

            Bookings customer;

            while (listIt.hasNext()) {
                customer = listIt.next();
                if (customer.getBookID().equals(bookID)) {
                    custLists.remove(index);
                    found = true;
                    break;
                }
                index++;
            }
            if (found) {
                if (flight.getAwaiting().size() > 0) {
                    Bookings luckyCust = flight.getAwaiting().removeFirst();
                    //add 5 sec delay to the existing service time
                    luckyCust.setBookServTime(luckyCust.getBookServTime() + 5000);
                    custLists.add(luckyCust);
                } else {
                    flight.setAvailSeats(flight.getAvailSeats() + 1);
                }
            }

            if (!found) {
                custLists = flight.getAwaiting();
                listIt = custLists.iterator();
                index = 0;

                while (listIt.hasNext()) {
                    customer = listIt.next();
                    if (customer.getBookID().equals(bookID)) {
                        custLists.remove(index);
                        found = true;
                        break;
                    }
                    index++;
                }
            }
        }
        return found;
    }
}
