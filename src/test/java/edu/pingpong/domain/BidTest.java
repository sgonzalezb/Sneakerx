package edu.pingpong.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import edu.pingpong.domain.offer.Bid;

import org.junit.Test;


public class BidTest {

    @Test
    public void constructorTest(){
        Bid bid = new Bid("250",600);
        assertNotNull(bid);
    }

    @Test
    public void toStringTest(){
        Bid bid = new Bid("250", 600);
        assertEquals("600 250", bid.toString());
    }

}
   