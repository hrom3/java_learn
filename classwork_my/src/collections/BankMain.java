package collections;

import collections.dto.Client;
import collections.dto.EGender;
import collections.dto.Passport;
import collections.service.Bank;
import collections.service.MapIBankStorage;

import java.util.Date;
import java.util.List;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank(new MapIBankStorage());
        Passport passport = new Passport();
        passport.setId("12343456677");
        passport.setNumber("122334344cvxvv");
        passport.setName("sgfeerfger");
        passport.setEGender(EGender.MAN);
        passport.setDateOfReg(new Date());
        passport.setBirthday(new Date());


        bank.saveNewClient(passport);

        Client client = bank.getClient("12343456677");

        System.out.println(client);

        List<Passport> passportsByClientId = bank.getPassportsByClientId("12343456677");

        System.out.println(passportsByClientId);

        List<Passport> passports = bank.getPassports();

        System.out.println(passports);
    }
}
