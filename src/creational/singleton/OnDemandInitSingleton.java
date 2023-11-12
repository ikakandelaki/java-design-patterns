package creational.singleton;

public final class OnDemandInitSingleton {
    public static int createdCount = 0;

    private OnDemandInitSingleton() {

    }

    public static OnDemandInitSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // lazy loaded
    private static class SingletonHolder {
        static {
            createdCount++;
        }

        private static final OnDemandInitSingleton INSTANCE = new OnDemandInitSingleton();
    }
}
