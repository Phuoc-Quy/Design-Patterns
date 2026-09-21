interface IterableCollection {
    Iterator createIterator();
}

class ConcreteCollectionA<T> implements IterableCollection {
    private List<T> collection;

    public ConcreteCollectionA(List<T> collection) {
        this.collection = collection;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorA<>(collection);
    }
}

class ConcreteCollectionB<T> implements IterableCollection {
    private List<T> collection;

    public ConcreteCollectionB(List<T> collection) {
        this.collection = collection;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorB<>(collection);
    }
}