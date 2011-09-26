package entities;

import java.util.Date;

public class Bookings {
    private String id;
    private String passportID;
    private String firstName;
    private String lastName;
    private long phNumber;
    private String address;
    private String flightCode;
    private long cardSerial;
    private int cardCode;
    private long bookWaitStart;
    private long bookServTime;
    private String bookID;

    public Bookings(String id, String passportID, String firstName,
            String lastName, long phNumber, String address, String flightCode,
            long cardSerial, int cardCode, long bookServTime, String bookID) {
        this.id = id;
        this.passportID = passportID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phNumber = phNumber;
        this.address = address;
        this.flightCode = flightCode;
        this.cardSerial = cardSerial;
        this.cardCode = cardCode;
        this.bookServTime = bookServTime;
        this.bookWaitStart = 0L;
        this.bookID = bookID;
    }
    
    public String getId(){
        return id;
    }
    public String getPassportID(){
        return passportID;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public long getPhNumber(){
        return phNumber;
    }
    public String getAddress(){
        return address;
    }
    public String getFlightCode(){
        return flightCode;
    }
    public long getCardSerial(){
        return cardSerial;
    }
    public int getCardCode(){
        return cardCode;
    }
    public String getBookID(){
        return bookID;
    }
    public long getBookServTime(){
        return bookServTime;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setPhNumber(long phNumber){
        this.phNumber = phNumber;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setBookWaitStart(long bookWaitStart){
        this.bookWaitStart = bookWaitStart;
    }
    public void setBookServTime(long bookServTime){
        this.bookServTime = bookServTime;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID number: ");
        sb.append(id);
        sb.append("\n");
        sb.append("Passport ID: ");
        sb.append(passportID);
        sb.append("\n");
        sb.append("First Name: ");
        sb.append(firstName);
        sb.append("\n");
        sb.append("Last Name: ");
        sb.append(lastName);
        sb.append("\n");
        sb.append("Phone Number: ");
        sb.append(phNumber);
        sb.append("\n");
        sb.append("Address: ");
        sb.append(address);
        sb.append("\n");
        sb.append("Flight Code: ");
        sb.append(flightCode);
        sb.append("\n");
        sb.append("Card Number: ");
        sb.append(cardSerial);
        sb.append("\n");
        sb.append("Card Code: ");
        sb.append(cardCode);
        sb.append("\n");
        return sb.toString();
    }
}
