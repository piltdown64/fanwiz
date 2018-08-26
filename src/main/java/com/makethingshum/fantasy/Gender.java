package com.makethingshum.fantasy;

/**
 * Created by jwells on 14/02/2017.
 */
public enum Gender {
    MALE("He"),
    FEMALE("She");

    private String pronoun;

    Gender(String pronoun) {
        this.pronoun = pronoun;
    }

    public String getPronoun() {
        return pronoun;
    }
}
