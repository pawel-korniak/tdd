package com.pawelkorniak;

import java.util.Objects;

class Monney {
    protected int ammount;
    protected String currency;

    public Monney(int ammount,String currency) {
        this.ammount = ammount;
        this.currency = currency;
    }

    public static Dollar dollar(int i) {
        return new Dollar(i,"USD");
    }

    public static Franc franc(int i) {
        return new Franc(i,"CHF");
    }

    @Override
    public boolean equals(Object o) {
        Monney monney = (Monney) o;
        return ammount == monney.ammount
                && currency.equals(monney.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ammount);
    }

    Monney times(int i){
        return new Monney(ammount * i,currency);
    }


    String currency(){
        return currency;
    }
}
