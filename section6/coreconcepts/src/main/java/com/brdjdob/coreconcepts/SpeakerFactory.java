package com.brdjdob.coreconcepts;

public class SpeakerFactory {

    public Speaker getSpeaker() {
        return new SonySpeaker();
    }
}
