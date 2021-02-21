package edu.pingpong.domain.offer;

import java.util.List;

public interface Item {

    int getBid();
    int getAsk();
    int getSale();
    void add(Offer offert);
    List <Offer> offers();
    void setBid(int bid);
    void setAsk(int ask);
    void setSale(int sale);
    
    
}
