package test;

public class DecoratorSpace extends Decorator {

    public DecoratorSpace(IInterfaceComponent c) {
        super(c);
    }

    @Override
    public void doOperation() {
        System.out.print(" ");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New space operation");
    }


}
