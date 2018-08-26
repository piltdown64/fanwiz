package com.makethingshum.fantasy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by jwells on 14/02/2017.
 */
public class Being implements Comparable<Being>{
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    public int getBfCount() {
        return bfCount;
    }

    public void setBfCount(int bfCount) {
        this.bfCount = bfCount;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Being getBestFriend() {
        return bestFriend;
    }

    public void setBestFriend(Being bestFriend) {
        this.bestFriend = bestFriend;
    }

    @Override
    public String toString() {
        return getFullname() + " is a " + getAge() + "y/o " + gender + " " + animal + " that is " + primaryColour + "" +
                " & " + secondaryColour + " with a " + patternColour + " " + pattern + " pattern. " + gender
                .getPronoun() + " is " + traits + ", likes " + getHobby() + getBf();
    }

    private String getBf() {
        if (bestFriend != null) {
            return " and is best friends with " + bestFriend.getFullname() + ", scoring " + bfCount + ". ";
        } else {
            return " They have no BF.";
        }
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Colour getPrimaryColour() {
        return primaryColour;
    }

    public void setPrimaryColour(Colour primaryColour) {
        this.primaryColour = primaryColour;
    }

    public Colour getSecondaryColour() {
        return secondaryColour;
    }

    public void setSecondaryColour(Colour secondaryColour) {
        this.secondaryColour = secondaryColour;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public Colour getPatternColour() {
        return patternColour;
    }

    public void setPatternColour(Colour patternColour) {
        this.patternColour = patternColour;
    }

    public Collection<Trait> getTraits() {
        return traits;
    }

    public void setTraits(Collection<Trait> traits) {
        this.traits = traits;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getFullname() {
        return firstName + " " + lastName;
    }


    @Override
    public int compareTo(Being other) {
        // compareTo should return < 0 if this is supposed to be
        // less than other, > 0 if this is supposed to be greater than
        // other and 0 if they are supposed to be equal
        int last = this.lastName.compareTo(other.lastName);
        return last == 0 ? this.firstName.compareTo(other.firstName) : last;
    }
}
