package utilities;

import entities.*;
import java.util.LinkedList;

public class Lists {
    private static LinkedList<Bookings> customers;
    
    public static void Initialize(){
        customers = new LinkedList<Bookings>();
    }
    public static LinkedList<Bookings> getCustomers(){
        return customers;
    }
}
