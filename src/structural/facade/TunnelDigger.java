package structural.facade;

// part of the goldmine subsystem
public class TunnelDigger extends MineWorker {
    @Override
    public String getName() {
        return "Tunnel digger";
    }

    @Override
    public void work() {
        System.out.println(getName() + " creates another tunnel.");
    }
}
