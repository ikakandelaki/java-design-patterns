package creational.factory;

// coin factory
public class CoinFactory {

    // factory method
    public static Coin getCoin(CoinType coinType) {
        return coinType.getCoinSupplier().get();
    }
}
