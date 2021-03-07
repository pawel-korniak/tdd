package com.pawelkorniak;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/*TODO
Dollars + Chf

 */

class DollarTest {

    @Test
    void times() {
        //given
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        //when
        assertEquals(product,five.times(2));
        //than

    }

    @Test
    public void anotherTimes(){
    //given
    Dollar five = new Dollar(5);
    //when
    Dollar product = five.times(3);
    //then
    assertEquals(product,five.times(3));
    }

    @Test
    public void dollarsAndChf(){
        //given
        Dollar five = new Dollar(5);
        //when

        //then
        assertEquals(new Dollar(15),five.times(3));
    }

    @Test
    public void isEqual(){
    //given

    //when

    //then
    assertEquals(new Dollar(5),new Dollar(5));
    }

    @Test
    public void isNotEqual(){
        //given

        //when

        //then
        assertNotEquals(new Dollar(6),new Dollar(5));
    }

}