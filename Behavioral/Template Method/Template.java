public abstract class Template {
    abstract void step1();
    abstract void step2();
    abstract void step3();
}

public class ConcreteTemplate extends Template {
    @Override
    void step1() {
        System.out.println("ConcreteTemplate: step1");
    }

    @Override
    void step2() {
        System.out.println("ConcreteTemplate: step2");
    }

    @Override
    void step3() {
        System.out.println("ConcreteTemplate: step3");
    }
}