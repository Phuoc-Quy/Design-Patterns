interface Iterator<T> {
    boolean hasNext();
    T next();
}

class ConcreteIteratorA<T> implements Iterator<T> {
    private List<T> collection;
    private int currentIndex = 0;

    public ConcreteIteratorA(List<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < collection.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return collection.get(currentIndex++);
    }
}   

class ConcreteIteratorB<T> implements Iterator<T> {
    private List<T> collection;
    private int currentIndex;

    public ConcreteIteratorB(List<T> collection) {
        this.collection = collection;
        this.currentIndex = collection.size() - 1; // Start from the end
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return collection.get(currentIndex--);
    }
}