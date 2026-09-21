public class Leaf<T> extends Component<T> {
    public Leaf(T value) {
        super(value);
    }

    @Override
    public void operation1(Component<T> component) {
        System.out.println("Leaf operation1");
    }

    @Override
    public void operation2(Component<T> component) {
        System.out.println("Leaf operation2");
    }

    @Override
    public void operation3(size_t index) {
        System.out.println("Leaf operation3");
    }
}