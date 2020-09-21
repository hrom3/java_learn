package classworkmy.generic.dto;

public class BoxNumber<T extends Number> {
    private T number;

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public double add(T a, T b) {
        double item = a.doubleValue();
        double item1 = b.doubleValue();

        return item + item1;
    }
}
