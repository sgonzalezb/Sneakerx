package edu.pingpong.domain;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.domain.criteria.Criteria;
import edu.pingpong.domain.criteria.MaxBid;
import edu.pingpong.domain.offer.Ask;
import edu.pingpong.domain.offer.Bid;
import edu.pingpong.domain.offer.Item;
import edu.pingpong.domain.offer.Offer;
import edu.pingpong.domain.offer.Sale;
import edu.pingpong.domain.offer.Sneaker;

public class MaxBidTest {


    Criteria Bids;

    Item sneaker;

    Criteria maxBid = new MaxBid();

    @Before

    public void setUpSneakers() {
        //Añado ofertas bid a sneaker
        this.sneaker = new Sneaker("Hola", "Adios");

        Sale sale = new Sale("Cero", 50);

        sneaker.add(sale);
        sneaker.add(new Ask("Uno", 100));
        sneaker.add(new Sale("Dos", 2));
        sneaker.add(new Bid("Tres", 5));
        sneaker.add(new Sale("Cuatro", 400));
        sneaker.add(new Sale("Cuatro", 500));
        sneaker.add(new Sale("Cuatro", 100));
        sneaker.add(new Sale("Cuatro", 400));
        sneaker.add(new Sale("Cuatro", 700));
        sneaker.add(new Ask("Cuatro", 1));
        sneaker.add(new Ask("Cuatro", 2));
        sneaker.add(new Bid("Tres", 56));
        sneaker.add(new Bid("Tres", 57));
        sneaker.add(new Bid("Tres", 59));




    }

    @Test // TENGO QUE TESTEAR QUE NO ENTREN VALORES NULOS, LA VERDAD ES QUE AHORA MISMO NO SÉ CÓMO HACERLO
    public void minTest() {
        for (Offer offer : maxBid.checkCriteria(this.sneaker)) {
            assertNotNull(offer);
            assertTrue(offer instanceof Bid);
            assertEquals(59, offer.value());

        }
    }
    
}
