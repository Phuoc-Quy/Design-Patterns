public abstract class Component<T> {
    protected T value;

    public Component(T value) {
        this.value = value;
    }

    public abstract void operation1(Component<T> component);
    public abstract void operation2(Component<T> component);
    public abstract void operation3(size_t index);
}