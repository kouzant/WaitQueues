package entities;


public class Statistics {
    private String flightCode;
    //ru8mos afi3eon
    private long l;
    private long m;
    
    private String r;
    private float rf;
    //mesos xronos anamonhs
    private long Wq;
    private long Ws;
    private float W;
    private long Lq;
    private long Ls;
    private long L;
    
    public Statistics(String flightCode){
        this.flightCode = flightCode;
        Lq = 0;
        Ls = 1;
        L = 0;
        l = 0;
        m = 0;
    }
    
    public String getFlightCode(){
        return flightCode;
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
    public void setM(long m){
        this.m = m;
    }
    public void setR(String r){
        this.r = r;
    }
    public void setW(float W){
        this.W = W;
    }
    public void setRf(float rf){
        this.rf = rf;
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
    public long getM(){
        return m;
    }
    public float getW(){
        return W;
    }
    public String getR(){
        return r;
    }
    public float getRf(){
        return rf;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Flight Code: "+flightCode).append("\n");
        sb.append("l: "+l).append("\n");
        sb.append("m: "+m).append("\n");
        sb.append("r: "+r).append("\n");
        sb.append("W: "+W).append("\n");
        
        return sb.toString();
    }
}
