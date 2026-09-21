public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}

public class RefinedAbstraction1 extends Abstraction {
    public RefinedAbstraction1(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("RefinedAbstraction operation");
        implementor.operation();
    }
}

public class RefinedAbstraction2 extends Abstraction {
    public RefinedAbstraction2(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("RefinedAbstraction2 operation");
        implementor.operation();
    }
}