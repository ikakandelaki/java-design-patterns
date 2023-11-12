package creational.singleton;

// thread safety guaranteed
public final class EagerInitSingleton {
    private static final EagerInitSingleton INSTANCE = new EagerInitSingleton();

    private EagerInitSingleton() {
    }

    public static EagerInitSingleton getInstance() {
        return INSTANCE;
    }
}
