package classworkmy.collections.service;

import classworkmy.collections.dto.Client;
import classworkmy.collections.dto.Passport;

import java.util.List;

public interface IBankStorage {
    void saveNewClient(Passport passport);
    Client getClient(String id);
    List<Passport> getPassportsByClientId(String id);
    List<Passport> getPassports();


}
