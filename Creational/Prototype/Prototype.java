public interface Prototype<T> {
    Prototype<T> clone();
}

public class ConcretePrototype1<T> implements Prototype<T> {
    private T field1;

    public ConcretePrototype1(T field1) {
        this.field1 = field1;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1<>(this.field1);
    }
}

public class ConcretePrototype2<T> implements Prototype<T> {
    private T field2;

    public ConcretePrototype2(T field2) {
        this.field2 = field2;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2<>(this.field2);
    }
}