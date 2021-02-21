package edu.pingpong.domain.offer;

public class Bid implements Offer {

    String size;
    Integer bid;

    public Bid(String size, Integer bid) {
        this.size = size;
        this.bid = bid;
    }


    public String size(){ //GETSIZE
        return this.size;
    }

    public int value(){
        return this.bid;
    }

    //compareTo(){}
    
    @Override
    public String toString() {
        return value()+ " " + size();
    }
    
}
