package entities;

import java.util.Date;

public class Flights {
    private String flightCode;
    private String departure;
    private String arrival;
    private Date depTime;
    private Date arrTime;
    private int totalSeats;
    private int availSeats;

    public Flights(String flightCode, String departure, String arrival,
            Date depTime, Date arrTime, int totalSeats, int availSeats){
        this.flightCode = flightCode;
        this.departure = departure;
        this.arrival = arrival;
        this.depTime = depTime;
        this.arrTime = arrTime;
        this.totalSeats = totalSeats;
        this.availSeats = availSeats;
    }
    public String getFlightCode(){
        return flightCode;
    }
    public String getDeparture(){
        return departure;
    }
    public String getArrival(){
        return arrival;
    }
    public Date getDepTime(){
        return depTime;
    }
    public Date getArrTime(){
        return arrTime;
    }
    public void setFlightCode(String flightCode){
        this.flightCode = flightCode;
    }
    public void setDeparture(String departure){
        this.departure = departure;
    }
    public void setArrival(String arrival){
        this.arrival = arrival;
    }
    public void setDepTime(Date depTime){
        this.depTime = depTime;
    }
    public void setArrTime(Date arrTime){
        this.arrTime = arrTime;
    }
    public void setTotalSeats(int totalSeats){
        this.totalSeats = totalSeats;
    }
    public void setAvailSeats(int availSeats){
        this.availSeats = availSeats;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Flight Code: ");
        sb.append(flightCode);
        sb.append("\n");
        sb.append("Departure: ");
        sb.append(departure);
        sb.append("\n");
        sb.append("Arrival: ");
        sb.append(arrival);
        sb.append("\n");
        sb.append("Departure Time: ");
        sb.append(depTime);
        sb.append("\n");
        sb.append("Arrival Time: ");
        sb.append(arrTime);
        sb.append("\n");
        return sb.toString();
    }
}
