package classworkmy.collections.dto;

import java.util.Date;
import java.util.Objects;

public class Client {
    private String id;
    private String name;
    private Date birthday;
    private EGender EGender;

    public Client(Passport passport) {
        this.id = passport.getId();
        this.name = passport.getName();
        this.birthday = passport.getBirthday();
        this.EGender = passport.getEGender();

    }


    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", EGender=" + EGender +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public EGender getGender() {
        return EGender;
    }

    public void setGender(EGender EGender) {
        this.EGender = EGender;
    }
}
