package edu.pingpong.domain.criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.pingpong.domain.offer.Bid;
import edu.pingpong.domain.offer.Item;
import edu.pingpong.domain.offer.Offer;

public class Bids implements Criteria {

    List<Offer> offers = new ArrayList<Offer>(); //Lista de Sneakers

    public Bids() {
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> bidsList = item.offers().stream().filter(o -> o instanceof Bid).filter(o -> o!=null).
        collect(Collectors.toList());
        return bidsList;
    }

    
}
