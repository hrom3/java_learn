package collections;

import collections.dto.PassportIdUnique;
import utils.RandomMy;

import java.util.HashSet;
import java.util.Set;

public class SetMain3 {
    public static void main(String[] args) {
        Set<PassportIdUnique> passports = new HashSet<>();
        RandomMy rnd = new RandomMy();
//        Passport passport1  = new PassportIdUnique(rnd.randomNextString(15),
//                "123456789",
//                rnd.randomNextString(9));

        passports.add(new PassportIdUnique(rnd.randomNextString(15),
                "123456789",
                rnd.randomNextString(9)));
        passports.add(new PassportIdUnique(rnd.randomNextString(15),
                "123458789",
                rnd.randomNextString(9)));
        passports.add(new PassportIdUnique(rnd.randomNextString(15),
                "123456789",
                rnd.randomNextString(9)));
        passports.add(new PassportIdUnique(rnd.randomNextString(15),
                "123456789",
                rnd.randomNextString(9)));
        passports.add(new PassportIdUnique(rnd.randomNextString(15),
                "123456789",
                rnd.randomNextString(9)));

        for (PassportIdUnique passport : passports) {
            System.out.println(passport.toString());
        }

    }
}
