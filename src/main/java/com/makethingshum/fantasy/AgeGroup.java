package com.makethingshum.fantasy;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by jwells on 14/02/2017.
 */
public enum AgeGroup {
    CHILD(0, 12), YOUNG_TEENAGER(13, 15), UPPER_TEEN(16,17), YOUNG_ADULT(18,25), MID_ADULT(26,39), MIDDLE_AGE(40,64), OAP(65, 100);

    private int minAge;
    private int maxAge;

    AgeGroup(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    public static AgeGroup getAgeGroup(Being being) {
        int ba = being.getAge();
        return Arrays.stream(AgeGroup.class.getEnumConstants()).filter(x -> (ba >= x.minAge & ba <= x.maxAge))
                .collect(Collectors.toList()).get(0);
    }
}
