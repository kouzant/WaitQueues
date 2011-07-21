package entities;

public class Booking {
    private String id;
    private String firstName;
    private String lastName;
    private long phNumber;
    private String address;

    public Booking(String id, String firstName, String lastName, long phNumber,
            String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phNumber = phNumber;
        this.address = address;
    }
    
    public String getId(){
        return id;
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
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID number: ");
        sb.append(id);
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
        return sb.toString();
    }
}
