package creational.factory;

public class App {
    public static void main(String[] args) {
        Coin copperCoin = CoinFactory.getCoin(CoinType.COPPER);
        Coin goldCoin = CoinFactory.getCoin(CoinType.GOLD);

        System.out.println("Copper coin descr: " + copperCoin.getDescription());
        System.out.println("Gold coin descr: " + goldCoin.getDescription());
    }
}
