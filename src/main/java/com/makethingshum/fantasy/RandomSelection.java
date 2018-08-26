package com.makethingshum.fantasy;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by jwells on 14/02/2017.
 */
public class RandomSelection {

    public static <E extends Enum<E>> E getRandom(Class<E> enumClass) {
        int pick = ThreadLocalRandom.current().nextInt(enumClass.getEnumConstants().length);
        return enumClass.getEnumConstants()[pick];
    }

    public static <E extends Enum<E>> E getRandomExcluding(Class<E> enumClass, E exclude) {
        E choice = getRandom(enumClass);
        if (enumClass.getEnumConstants().length > 1) {
            while (choice == null || choice == exclude) {
                choice = getRandom(enumClass);
            }
        }
        return choice;
    }
}

