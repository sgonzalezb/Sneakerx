package edu.pingpong.domain.criteria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import edu.pingpong.domain.offer.Bid;
import edu.pingpong.domain.offer.Item;
import edu.pingpong.domain.offer.Offer;
import edu.pingpong.domain.offer.Sneaker;

public class MaxBid implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> bidsList = sneaker.offers().stream().filter(o -> o instanceof Bid).filter(o -> o!=null).
        collect(Collectors.toList());
        List<Offer> checkCriteria = new ArrayList<Offer>();
        int value = 0;
        for (Offer offer : bidsList){
            if(offer.value() > value){
                value = offer.value();
                checkCriteria.clear();
                checkCriteria.add(offer);
            }  
        }
        /** List<Offer> checkCriteria = bidsList.stream().max(Comparator.comparing(Bid).get(); Intentar con stream este filtro*/
        return checkCriteria;
        
    }

    
}
