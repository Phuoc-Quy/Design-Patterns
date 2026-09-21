public interface Implementor {
    void operation();
}

public class Implementor1 implements Implementor {
    @Override
    public void operation() {
        System.out.println("Implementor1 operation");
    }
}

public class Implementor2 implements Implementor {
    @Override
    public void operation() {
        System.out.println("Implementor2 operation");
    }
}