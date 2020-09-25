package classworkmy.collections.dto;

import java.util.Date;

public class Passport {
    private String name;
    private String id;
    private String number;
    private Date birthday;
    private EGender EGender;
    private Date dateOfReg;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public classworkmy.collections.dto.EGender getEGender() {
        return EGender;
    }

    public void setEGender(classworkmy.collections.dto.EGender EGender) {
        this.EGender = EGender;
    }

    public Date getDateOfReg() {
        return dateOfReg;
    }

    public void setDateOfReg(Date dateOfReg) {
        this.dateOfReg = dateOfReg;
    }

    public Passport(String name, String id, String number) {
        this.name = name;
        this.id = id;
        this.number = number;
    }

    public Passport() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
