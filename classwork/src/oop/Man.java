package oop;

class Man {
    private String name;
    private int hairLength;
    private int varible1;
    protected int varible2;
    int varible3;
    public int varible4;

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
