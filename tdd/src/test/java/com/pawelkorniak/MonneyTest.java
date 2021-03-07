package com.pawelkorniak;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
public class MonneyTest {

    @Test
    public void monneyTest(){
    Monney five = Monney.dollar(5);
    assertEquals(new Dollar(10,"USD"),five.times(2));
    assertEquals(Monney.dollar(10),five.times(2));
    assertNotEquals(new Dollar(5,"USD"),new Franc(5,"CHF"));
    assertEquals(new Franc(5,"CHF"),Monney.franc(5));
    assertEquals(new Monney(10,"CHF"),new Franc(10,"CHF"));
    }
    @Test
    public void testCurrency() {
        assertEquals("USD", Monney.dollar(1).currency());
        assertEquals("CHF", Monney.franc(1).currency());
    }
}
