package test;

class DecoratorComma extends Decorator {

    public DecoratorComma(IInterfaceComponent c) {
        super(c);
    }

    @Override
    public void doOperation() {
        System.out.print(",");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New comma operation");
    }
}