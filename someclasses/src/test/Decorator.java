package test;

public class Decorator implements IInterfaceComponent {
    protected IInterfaceComponent component;

    public Decorator(IInterfaceComponent c) {
        component = c;
    }

    @Override
    public void doOperation() {
        component.doOperation();
    }

    public void newOperation() {
        System.out.println("Do Nothing");
    }
}
