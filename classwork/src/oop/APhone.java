package oop;

public abstract class APhone {
    private String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public abstract String getModel();


    public void call(String phoneNumber) {
        System.out.println("Модный талефон " + getModel() + " владельца " + ownerName +" звонит " + phoneNumber);
    }
}
