package structural.facade;

// part of the goldmine subsystem
public class CartOperator extends MineWorker {
    @Override
    public String getName() {
        return "Cart operator";
    }

    @Override
    public void work() {
        System.out.println(getName() + " moves gold chunks out of the mine.");
    }
}
