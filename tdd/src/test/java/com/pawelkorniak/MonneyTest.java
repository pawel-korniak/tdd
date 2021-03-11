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

    @Test
    public void adding(){
    //given
    Monney five = Monney.dollar(5);
    Expression sum = five.plus(five);
    Bank bank = new Bank();
    Monney reduce = bank.reduce(sum,"USD");
    //when

    //than
    assertEquals(Monney.dollar(10),reduce);
    }

    @Test
    public void testPlusReturnsSum(){
    //given
        Monney five = Monney.dollar(5);
        Expression result = five.plus(five);

        Bank bank = new Bank();
        Sum sum = (Sum) result;
        //when

        //than
        assertEquals(five,sum.augend);
        assertEquals(five,sum.addened);
    }

    @Test
    public void testSumInBank(){
    //given
    Bank bank = new Bank();
    Expression sum = Monney.dollar(3).plus(Monney.dollar(4));
    Monney result = bank.reduce(sum,"USD");
    //when

    //than
    assertEquals(Monney.dollar(7),result);
    }
    
    @Test
    public void reducing(){
    //given
    Bank bank = new Bank();
    //when
    Monney result = bank.reduce(Monney.dollar(1),"USD");
    //than
    assertEquals(Monney.dollar(1),result);
    }

}
