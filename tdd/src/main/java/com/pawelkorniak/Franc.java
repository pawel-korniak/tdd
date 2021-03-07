package com.pawelkorniak;

import java.util.Objects;

public class Franc {
    private int ammount;

    public Franc(int i) {
        ammount = i;
    }

    public Franc times(int i) {
        return new Franc(ammount * i);
    }

    @Override
    public boolean equals(Object obj) {
        Franc other = (Franc)obj;
        return this.ammount == other.ammount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ammount);
    }
}
