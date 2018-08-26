package com.makethingshum.fantasy;

/**
 * Created by jwells on 14/02/2017.
 */
public enum Hobby {
    DANCING("Dancing"),
    SKYDIVING("Sky Diving"),
    PROGRAMMING("Programming"),
    RUNNING("Running"),
    BUNGY("Bungy Jumping"),
    SWIMMING("Swimming"),
    SINGING("Singing"),
    DRAMA("Drama"),
    FOOTBALL("Football"),
    SQUASH("Squash"),
    ART("Art"),
    HIGHJUMP("Highjump"),
    EATING("Eating"),
    SLEEPING("Sleeping"),
    CRICKET("Cricket"),
    NATURE("Nature"),
    ORIGAMI("Origami");

    private String description;

    Hobby(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
