package edu.pingpong.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import edu.pingpong.domain.offer.Sale;

import org.junit.Test;


public class SaleTest {

    @Test
    public void constructorTest(){
        Sale sale = new Sale("250",600);
        assertNotNull(sale);
    }

    @Test
    public void toStringTest(){
        Sale sale = new Sale("250", 600);
        assertEquals("600 250", sale.toString());
    }

}
   