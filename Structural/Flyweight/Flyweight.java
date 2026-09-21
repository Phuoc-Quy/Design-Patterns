interface Flyweight<T> {
    void operation(T extrinsicState);
}

public class ConcreteFlyweight<T> implements Flyweight<T> {
    private final T intrinsicState;

    public ConcreteFlyweight(T intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(T extrinsicState) {
        System.out.println("Concrete Flyweight");
    }
}

public class UnsharedConcreteFlyweight<T> implements Flyweight<T> {
    private final T extrinsicState;

    public UnsharedConcreteFlyweight(T extrinsicState) {
        this.extrinsicState = extrinsicState;
    }

    @Override
    public void operation(T extrinsicState) {
        System.out.println("Unshared Flyweight");
    }
}