package com.pawelkorniak;

import java.util.Objects;

public class Monney {
    protected int ammount;

    public Monney(int ammount) {
        this.ammount = ammount;
    }

    @Override
    public boolean equals(Object o) {
        Monney monney = (Monney) o;
        return ammount == monney.ammount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ammount);
    }
}
