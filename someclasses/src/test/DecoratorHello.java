package test;

class DecoratorHello extends Decorator {

    public DecoratorHello(IInterfaceComponent c) {
        super(c);
    }

    @Override
    public void doOperation() {
        System.out.print("Hello");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New hello operation");
        super.doOperation();
    }
}

