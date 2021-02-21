package edu.pingpong.domain.offer;

public class Ask implements Offer{

    String size;
    Integer ask;

    public Ask(String size, Integer ask) {
        this.size = size;
        this.ask = ask;
    }


    public String size(){ //GETSIZE
        return this.size;
    }

    public int value(){
        return this.ask;
    }

    //compareTo(){}
    
    @Override
    public String toString() {
        return value()+ " " + size();
    }
    
}
