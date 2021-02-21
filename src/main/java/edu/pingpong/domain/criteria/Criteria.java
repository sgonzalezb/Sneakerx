package edu.pingpong.domain.criteria;

import java.util.List;

import edu.pingpong.domain.offer.Item;
import edu.pingpong.domain.offer.Offer;

public interface Criteria {

    List<Offer> checkCriteria(Item sneaker);
    
}
