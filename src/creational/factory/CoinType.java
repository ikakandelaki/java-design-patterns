package creational.factory;

import java.util.function.Supplier;

public enum CoinType {
    COPPER(CopperCoin::new),
    GOLD(GoldCoin::new);

    private final Supplier<Coin> coinSupplier;

    CoinType(Supplier<Coin> coinSupplier) {
        this.coinSupplier = coinSupplier;
    }

    public Supplier<Coin> getCoinSupplier() {
        return coinSupplier;
    }
}
