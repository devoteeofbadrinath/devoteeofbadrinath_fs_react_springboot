package com.brdjdob.corecpncepts;

public class SpeakerFactory {

    public Speaker getSpeaker() {
        return new SonySpeaker();
    }
}
