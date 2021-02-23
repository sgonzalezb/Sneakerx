package edu.pingpong.domain.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.pingpong.domain.offer.Item;
import edu.pingpong.domain.offer.Offer;

public class LastSale implements Criteria{

    private List<Offer> lastSale = new ArrayList<>();

    Criteria sales = new Sales();

    public LastSale(){};

	@Override
	public List<Offer> checkCriteria(Item sneaker) {
		
        Offer lastSaleOffer = sales.checkCriteria(sneaker).stream().filter(o -> o!=null).reduce((first, second) -> second).orElse(null);
        lastSale.add(lastSaleOffer);

		return lastSale;
	}


    
}
