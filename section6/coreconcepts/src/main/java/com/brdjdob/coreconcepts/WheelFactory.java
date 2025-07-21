package com.brdjdob.corecpncepts;

public class WheelFactory {

    public Wheel getWheel() {
        return new MichelinWheel();
    }
}
