package edu.pingpong.stockx.domain.offer;

import java.util.List;

public class Sneaker implements Item {

    String style;
    String name;
    int sale;
    int ask;
    int bid;

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
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getAsk() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getSale() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void add(Offer offert) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Offer> offers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setBid(int bid) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setAsk(int ask) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setSale(int sale) {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        return "\t" + getName() + "\n"
                + "\t" + getStyle();
    }

    


    
}
