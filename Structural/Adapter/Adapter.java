public interface NewInterface {
    void newMethod();
}

public class Adapter implements NewInterface {
    private OldClass oldObject;

    public Adapter(OldClass oldObject) {
        this.oldObject = oldObject;
    }

    @Override
    public void newMethod() {
        oldObject.oldMethod();
    }
}