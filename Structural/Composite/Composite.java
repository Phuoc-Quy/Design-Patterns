public class Composite<T> extends Component<T> {
    private List<Component<T>> children = new ArrayList<>();

    public Composite(T value) {
        super(value);
    }

    public void add(Component<T> component) {
        children.add(component);
    }

    public void remove(Component<T> component) {
        children.remove(component);
    }

    @Override
    public void operation1(Component<T> component) {
        System.out.println("Composite operation1");
        for (Component<T> child : children) {
            child.operation1(component);
        }
    }

    @Override
    public void operation2(Component<T> component) {
        System.out.println("Composite operation2");
        for (Component<T> child : children) {
            child.operation2(component);
        }
    }

    @Override
    public void operation3(size_t index) {
        System.out.println("Composite operation3");
        for (Component<T> child : children) {
            child.operation3(index);
        }
    }
}