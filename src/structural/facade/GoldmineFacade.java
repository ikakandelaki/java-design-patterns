package structural.facade;

import java.util.List;


// single interface which operates subsystems
public class GoldmineFacade {
    private final List<MineWorker> workers;

    public GoldmineFacade() {
        this.workers = List.of(
                new GoldDigger(),
                new CartOperator(),
                new TunnelDigger()
        );
    }

    public void startNewDay() {
        makeActions(MineWorker.Action.WAKE_UP, MineWorker.Action.GO_TO_MINE);
    }

    public void digOutGold() {
        makeActions(MineWorker.Action.WORK);
    }

    public void endDay() {
        makeActions(MineWorker.Action.GO_HOME, MineWorker.Action.GO_TO_SLEEP);
    }

    private void makeActions(MineWorker.Action... actions) {
        workers.forEach(worker -> worker.performActions(actions));
    }
}
