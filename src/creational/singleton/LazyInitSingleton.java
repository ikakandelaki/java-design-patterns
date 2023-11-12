package creational.singleton;

public final class LazyInitSingleton {
    private static LazyInitSingleton instance;
    public static int createdCount = 0;

    private LazyInitSingleton() {

    }

    public static synchronized LazyInitSingleton getInstance() {
        if (instance == null) {
            createdCount++;
            instance = new LazyInitSingleton();
        }
        return instance;
    }
}
