package structural.facade;

// part of the goldmine subsystem
public class GoldDigger extends MineWorker {
    @Override
    public String getName() {
        return "Gold digger";
    }

    @Override
    public void work() {
        System.out.println(getName() + " digs for gold.");
    }
}
