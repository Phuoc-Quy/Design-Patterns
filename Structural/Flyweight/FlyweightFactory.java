public class FlyweightFactory<T> {
    private static <T, Flyweight<T>> flyweights = new HashMap<>();

    public static Flyweight<T> getFlyweight(T intrinsicState) {
        if (!flyweights.containsKey(intrinsicState)) {
            flyweights.put(intrinsicState, new ConcreteFlyweight<>(intrinsicState));
        }
        return flyweights.get(intrinsicState);
    }

    public static Flyweight<T> getUnsharedFlyweight(T extrinsicState) {
        return new UnsharedConcreteFlyweight<>(extrinsicState);
    }
}