interface AbstractProductA {
    void doSomethingA();
}
interface AbstractProductB {
    void doSomethingB();
}

class ConcreteProductA1 implements AbstractProductA {
    @Override
    public void doSomethingA() {
        System.out.println("ConcreteProductA1 is doing something.");
    }
}
class ConcreteProductB1 implements AbstractProductB {
    @Override
    public void doSomethingB() {
        System.out.println("ConcreteProductB1 is doing something.");
    }
}
class ConcreteProductA2 implements AbstractProductA {
    @Override
    public void doSomethingA() {
        System.out.println("ConcreteProductA2 is doing something.");
    }
}
class ConcreteProductB2 implements AbstractProductB {
    @Override
    public void doSomethingB() {
        System.out.println("ConcreteProductB2 is doing something.");
    }
}