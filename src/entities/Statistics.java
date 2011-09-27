package entities;


public class Statistics {
    private String flightCode;
    //ru8mos afi3eon
    private long l;
    private long m;
    
    private long r;
    //mesos xronos anamonhs
    private long Wq;
    private long Ws;
    private long W;
    private long Lq;
    private long Ls;
    private long L;
    
    public Statistics(String flightCode){
        this.flightCode = flightCode;
        Lq = 0;
        Ls = 0;
        L = 0;
        l = 0;
    }
    
    public void setLq(long Lq){
        this.Lq = Lq;
    }
    public void setLs(long Ls){
        this.Ls = Ls;
    }
    public void setl(long l){
        this.l = l;
    }
    public void setL(long L){
        this.L = L;
    }
    public long getLq(){
        return Lq;
    }
    public long getLs(){
        return Ls;
    }
    public long getl(){
        return l;
    }
    public long getL(){
        return L;
    }
}
