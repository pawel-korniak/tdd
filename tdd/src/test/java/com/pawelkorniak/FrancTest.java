package com.pawelkorniak;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/*TODO
Dollars + Chf

 */

class FrancTest {

    @Test
    void times() {
        //given
        Franc five = new Franc(5);
        Franc product = five.times(2);
        //when
        assertEquals(product,five.times(2));
        //than

    }

    @Test
    public void anotherTimes(){
        //given
        Franc five = new Franc(5);
        Franc product = five.times(3);
        //when

        //then
        assertEquals(product,five.times(3));
    }

    @Test
    public void dollarsAndChf(){
        //given
        Franc five = new Franc(5);
        //when

        //then
        assertEquals(new Franc(15),five.times(3));
    }

    @Test
    public void isEqual(){
        //given

        //when

        //then
        assertEquals(new Franc(5),new Franc(5));
    }

    @Test
    public void isNotEqual(){
        //given

        //when

        //then
        assertNotEquals(new Franc(6),new Franc(5));
    }



}