package edu.pingpong.domain.offer;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {

    String style;
    String name;
    int sale;
    int ask;
    int bid;
    List<Offer> offers = new ArrayList<Offer>();

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return this.style;
    }

    public String getName() {
        return this.name;
    }

    
    @Override
    public int getBid() {
        return this.bid;
    }

    @Override
    public int getAsk() {
        return this.ask;
    }

    @Override
    public int getSale() {
        return this.sale;
    }

    @Override
    public void add(Offer offert){
        this.offers.add(offert); 
    }

    @Override
    public List<Offer> offers() {
        return offers;
    }

    @Override
    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public void setAsk(int ask) {
        this.ask = ask;
    }

    @Override
    public void setSale(int sale) {
        this.sale = sale;

    }

    @Override
    public String toString() {
        return "\t" + getName() + "\n"
                + "\t" + getStyle();
    }

    


    
}
