package creational.singleton;

public class App {
    public static void main(String[] args) {
        EagerInitSingleton eis1 = EagerInitSingleton.getInstance();
        EagerInitSingleton eis2 = EagerInitSingleton.getInstance();
        System.out.println(eis1 == eis2);

        LazyInitSingleton lis1 = LazyInitSingleton.getInstance();
        LazyInitSingleton lis2 = LazyInitSingleton.getInstance();
        System.out.println(lis1 == lis2);
        System.out.println(LazyInitSingleton.createdCount == 1);

        System.out.println(OnDemandInitSingleton.createdCount == 0);
        OnDemandInitSingleton ois1 = OnDemandInitSingleton.getInstance();
        OnDemandInitSingleton ois2 = OnDemandInitSingleton.getInstance();
        System.out.println(ois1 == ois2);
        System.out.println(OnDemandInitSingleton.createdCount == 1);
    }
}
