package com.makethingshum.fantasy;

/**
 * Created by jwells on 14/02/2017.
 */
public enum Animal {
    UNICORN("Unicorn"),
    DRAGON("Dragon"),
    DOLPHIN("Dolphin"),
    PIG("Pig"),
    KITTEN("Kitten"),
    PEGASUS("Pegasus"),
    CHEETAH("Cheetah"),
    FLYINGPIG("Flying Pig"),
    JAGUAR("Jaguar"),
    EAGLE("Eagle"),
    SEACOW("Sea Cow");

    private String description;

    Animal(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
