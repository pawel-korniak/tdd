package com.pawelkorniak;

public class Sum implements Expression{
    Monney addened;
    Monney augend;

    public Sum(Monney addened, Monney augend) {
        this.addened = addened;
        this.augend = augend;
    }

    public Monney reduce(String to) {
        int ammount = addened.ammount + augend.ammount;
        return new Monney(ammount,to);
    }
}
