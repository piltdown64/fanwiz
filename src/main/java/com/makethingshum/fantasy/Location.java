package com.makethingshum.fantasy;

/**
 * Created by jwells on 14/02/2017.
 */
public enum Location {
    BENTALLS("Bentalls Shopping Centre"),
    STPAULS("St. Pauls School Playground"),
    RAINFOREST("Rainforest"),
    SKATEPARK("Skate Park"),
    EMIRATES("Emirates Stadium"),
    WHITEHOUSE("The Whitehouse"),
    MARS("Planet Mars"),
    SPAIN("Spain"),
    WEMBLEY("Wembley Stadium"),
    PAKISTAN("Pakistan"),
    O2("O2 Arena");

    private String description;

    Location(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
