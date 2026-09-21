public interface Visitor {
    void visitConcreteElementA(ConcreteElementA elementA);
    void visitConcreteElementB(ConcreteElementB elementB);
}

public class ConcreteVisitor1 implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA elementA) {
        System.out.println("ConcreteVisitor1 is visiting ConcreteElementA.");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB elementB) {
        System.out.println("ConcreteVisitor1 is visiting ConcreteElementB.");
    }
}

public class ConcreteVisitor2 implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA elementA) {
        System.out.println("ConcreteVisitor2 is visiting ConcreteElementA.");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB elementB) {
        System.out.println("ConcreteVisitor2 is visiting ConcreteElementB.");
    }
}