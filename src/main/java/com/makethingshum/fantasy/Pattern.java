package com.makethingshum.fantasy;

/**
 * Created by jwells on 14/02/2017.
 */
public enum Pattern {
    STRIPY("Stripy"),
    SQUIGGLY("Squiggly"),
    ZIGZAG("Zigzag"),
    STARS("Stars"),
    SPOTTY("Spotty"),
    SPIRAL("Spiral");

    private String description;

    Pattern(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
