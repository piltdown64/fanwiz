package com.makethingshum.fantasy.builders;

import com.makethingshum.fantasy.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by jwells on 19/06/2017.
 */
public final class BeingBuilder {
    private Gender gender;
    private Animal animal;
    private String firstName;
    private String lastName = RandomSelection.getRandom(Surnames.class).toString();
    private String description = "TBC";
    private Colour primaryColour;
    private Colour secondaryColour;
    private Pattern pattern;
    private Colour patternColour;
    private Hobby hobby;
    private Collection<Trait> traits = new HashSet<Trait>(3);
    private Being bestFriend;
    private int bfCount;
    private int age = ThreadLocalRandom.current().nextInt(6, 60 + 1);

    private BeingBuilder() {
    }

    public static BeingBuilder aBeing() {
        return new BeingBuilder();
    }

    public BeingBuilder withGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public BeingBuilder withAnimal(Animal animal) {
        this.animal = animal;
        return this;
    }

    public BeingBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public BeingBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public BeingBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public BeingBuilder withPrimaryColour(Colour primaryColour) {
        this.primaryColour = primaryColour;
        return this;
    }

    public BeingBuilder withSecondaryColour(Colour secondaryColour) {
        this.secondaryColour = secondaryColour;
        return this;
    }

    public BeingBuilder withPattern(Pattern pattern) {
        this.pattern = pattern;
        return this;
    }

    public BeingBuilder withPatternColour(Colour patternColour) {
        this.patternColour = patternColour;
        return this;
    }

    public BeingBuilder withHobby(Hobby hobby) {
        this.hobby = hobby;
        return this;
    }

    public BeingBuilder withTraits(Collection<Trait> traits) {
        this.traits = traits;
        return this;
    }

    public BeingBuilder withBestFriend(Being bestFriend) {
        this.bestFriend = bestFriend;
        return this;
    }

    public BeingBuilder withBfCount(int bfCount) {
        this.bfCount = bfCount;
        return this;
    }

    public BeingBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public Being build() {
        Being being = new Being();
        being.setGender(gender);
        being.setAnimal(animal);
        being.setFirstName(firstName);
        being.setLastName(lastName);
        being.setDescription(description);
        being.setPrimaryColour(primaryColour);
        being.setSecondaryColour(secondaryColour);
        being.setPattern(pattern);
        being.setPatternColour(patternColour);
        being.setHobby(hobby);
        being.setTraits(traits);
        being.setBestFriend(bestFriend);
        being.setBfCount(bfCount);
        being.setAge(age);
        return being;
    }
}
