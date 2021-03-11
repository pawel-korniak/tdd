package com.pawelkorniak;

public class Bank{
    Monney reduce(Expression source,String to){
        Sum sum = (Sum) source;
        return sum.reduce(to);
    }
}
