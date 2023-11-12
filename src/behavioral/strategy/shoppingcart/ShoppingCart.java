package behavioral.strategy.shoppingcart;

import behavioral.strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int calculateTotal() {
        return items.stream()
                .map(Item::getPrice)
                .reduce(0, Integer::sum);
    }

    public void pay(PaymentStrategy paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
