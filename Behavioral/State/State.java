public interface State {
    void handleRequest();
}

public class ConcreteStateA implements State {
    @Override
    public void handleRequest() {
        System.out.println("Handling request by ConcreteStateA");
    }
}

public class ConcreteStateB implements State {
    @Override
    public void handleRequest() {
        System.out.println("Handling request by ConcreteStateB");
    }
}