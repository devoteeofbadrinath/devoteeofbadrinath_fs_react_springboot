package com.brdjdob.coreconcepts;

public class WheelFactory {

    public Wheel getWheel() {
        return new MichelinWheel();
    }
}
