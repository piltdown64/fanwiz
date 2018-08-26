package com.makethingshum.fantasy;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Wizard {

    List<Being> beingList = new ArrayList<Being>(10);

    private int numberOfBeings = randomNumber(10, 20);
    private Gender preferredGender = null;

    public static void main(String[] args) {
        Wizard harry = new Wizard();

        if (args.length > 0) {
            harry.numberOfBeings = Integer.parseInt(args[0]);
            if (harry.numberOfBeings == 0) {
                harry.numberOfBeings = randomNumber(10, 20);
            }

            if (args.length > 1) {
                harry.preferredGender = Gender.valueOf(args[1]);
            }
        }

        for (int x = 0; x < harry.numberOfBeings; x++) {
            Being being = new Being();

            // Set gender
            if (harry.preferredGender != null) {
                being.setGender(harry.preferredGender);
            } else {
                being.setGender(RandomSelection.getRandom(Gender.class));
            }

            // Set name
            if (being.getGender() == Gender.MALE) {
                being.setFirstName(RandomSelection.getRandom(MaleNames.class).toString());
            } else {
                being.setFirstName(RandomSelection.getRandom(FemaleNames.class).toString());
            }

            being.setAnimal(RandomSelection.getRandom(Animal.class));

            being.setPrimaryColour(RandomSelection.getRandom(Colour.class));
            being.setSecondaryColour(RandomSelection.getRandomExcluding(Colour.class, being.getPrimaryColour()));

            being.setPattern(RandomSelection.getRandom(Pattern.class));
            being.setPatternColour(RandomSelection.getRandom(Colour.class));

            being.setHobby(RandomSelection.getRandom(Hobby.class));

            Set<Trait> traitsList = new HashSet<Trait>(3);
            for (int i = 0; i < 2; i++) {
                Trait trait = RandomSelection.getRandom(Trait.class);
                traitsList.add(trait);
            }

            being.setTraits(traitsList);

            harry.beingList.add(being);
        }

        determineFriends(harry.beingList);
        Collections.sort(harry.beingList);

        for (Being theBeing : harry.beingList) {
            System.out.println(theBeing);
        }
    }

    private static int randomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    private static void determineFriends(Collection<Being> beings) {
        Being bestFriend = null;
        for (Being being : beings) {
            int highMatchCount = 0;

            List<Being> potentialFriends = beings.stream().filter(x -> (x != being && AgeGroup.getAgeGroup(x) ==
                    AgeGroup.getAgeGroup(being))).collect(Collectors.toList());

            for (Being potentialFriend : potentialFriends) {
                int matchCount = 0;

                matchCount += being.getAnimal() == potentialFriend.getAnimal() ? 1 : 0;
                matchCount += being.getGender() == potentialFriend.getGender() ? 1 : 0;
                matchCount += being.getPrimaryColour() == potentialFriend.getPrimaryColour() ? 1 : 0;
                matchCount += being.getSecondaryColour() == potentialFriend.getSecondaryColour() ? 1 : 0;
                matchCount += being.getPattern() == potentialFriend.getPattern() ? 1 : 0;
                matchCount += being.getPatternColour() == potentialFriend.getPatternColour() ? 1 : 0;
                matchCount += being.getHobby() == potentialFriend.getHobby() ? 2 : 0; // extra weighting for hobby


                for (Trait beingTrait : being.getTraits()) {
                    matchCount += potentialFriend.getTraits().contains(beingTrait) ? 1 : 0;
                }

                if (matchCount > highMatchCount) {
                    highMatchCount = matchCount;
                    being.setBestFriend(potentialFriend);
                    being.setBfCount(highMatchCount);
                }
            }


        }
    }

}
