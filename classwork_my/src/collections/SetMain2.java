package collections;

import classworkmy.collections.dto.Passport;
import utils.RandomMy;

import java.util.HashSet;
import java.util.Set;

public class SetMain2 {
    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        RandomMy rnd = new RandomMy();
        Passport passport1  = new Passport(rnd.randomNextString(15),
                "123456789",
                rnd.randomNextString(9));

        passports.add(passport1);
        passports.add(passport1);
        passports.add(passport1);
        passports.add(passport1);

        for (Passport passport : passports) {
            System.out.println(passport);
        }

    }
}
