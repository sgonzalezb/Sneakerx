package edu.pingpong.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import edu.pingpong.domain.offer.Ask;

import org.junit.Test;


public class AskTest {

    @Test
    public void constructorTest(){
        Ask ask = new Ask("250",600);
        assertNotNull(ask);
    }

    @Test
    public void toStringTest(){
        Ask ask = new Ask("250", 600);
        assertEquals("600", ask.toString());
    }

}
   