package com.pawelkorniak;

import java.util.Objects;

public class Franc extends Monney{

    public Franc(int ammount) {
        super(ammount);
    }

    public Franc times(int i) {
        return new Franc(ammount * i);
    }

}
