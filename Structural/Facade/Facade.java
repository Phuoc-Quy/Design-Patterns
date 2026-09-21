public class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;
    private Subsystem3 subsystem3;

    public Facade() {
        subsystem1 = new Subsystem1();
        subsystem2 = new Subsystem2();
        subsystem3 = new Subsystem3();
    }

    public void operationA() {
        System.out.println("Facade: operationA");
        subsystem1.operation1();
        subsystem2.operation1();
        subsystem3.operation1();
    }

    public void operationB() {
        System.out.println("Facade: operationB");
        subsystem1.operation2();
        subsystem2.operation2();
        subsystem3.operation2();
        subsystem3.operation3();
    }

    public void operationC() {
        System.out.println("Facade: operationC");
        subsystem1.operation3();
        subsystem2.operation3();
        subsystem3.operation4();
    }
}