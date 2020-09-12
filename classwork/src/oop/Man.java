package oop;

public class Man {
    private String name;
    private int hairLength;
    private int yearOld;

    public ETypeMan getType() {
        return type;
    }

    public void setType(ETypeMan type) {
        this.type = type;
    }

    ETypeMan type;



    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public Man() {
        name = "Иван";
        hairLength = 5;
    }

    private Man(String name, int hairLength) {
        this.name = name;
        this.hairLength = hairLength;
    }

    @Override
    public String toString() {
        return '\"' + name + '\"' +
                ", \"" + hairLength +
                '\"';
    }

    public void grow() {
        hairLength++;
    }
    public String sayHello() {
        return "Привет!";
    }

    public String getName() {
        return this.name;
    }

    public int getHairLength() {
        return this.hairLength;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHairLength(int hairLength) {
        this.hairLength = hairLength;
    }
}
