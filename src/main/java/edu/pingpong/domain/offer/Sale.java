package edu.pingpong.domain.offer;

public class Sale implements Offer {

    String size;
    Integer price;

    public Sale(String size, Integer price) {
        this.size = size;
        this.price = price;
    }


    public String size(){ //GETSIZE
        return this.size;
    }

    public int value(){
        return this.price;
    }

    //compareTo(){}
    
    @Override
    public String toString() {
        return value()+ " " + size();
    }
    
}
