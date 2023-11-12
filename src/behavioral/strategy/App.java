package behavioral.strategy;

import behavioral.strategy.shoppingcart.Item;
import behavioral.strategy.shoppingcart.ShoppingCart;

public class App {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1234", 10));
        cart.addItem(new Item("5678", 20));

        cart.pay(new PaypalStrategy("ex@gmail.com", "pass"));
        cart.pay(new CreditCardStrategy("name", "number", "cvv", "date"));
    }
}
