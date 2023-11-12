package structural.facade;

import java.util.Arrays;

// part of the goldmine subsystem
public abstract class MineWorker {
    enum Action {
        WAKE_UP,
        GO_TO_MINE,
        WORK,
        GO_HOME,
        GO_TO_SLEEP
    }

    public abstract String getName();

    public abstract void work();

    public void performActions(Action... actions) {
        Arrays.stream(actions)
                .forEach(this::performAction);
    }

    private void performAction(Action action) {
        switch (action) {
            case WAKE_UP -> wakeUp();
            case GO_TO_MINE -> goToMine();
            case WORK -> work();
            case GO_HOME -> goHome();
            case GO_TO_SLEEP -> goToSleep();
            default -> System.out.println("Undefined action");
        }
    }

    public void wakeUp() {
        System.out.println(getName() + " wakes up.");
    }

    public void goToMine() {
        System.out.println(getName() + " goes to the mine.");
    }

    public void goHome() {
        System.out.println(getName() + " goes home.");
    }

    public void goToSleep() {
        System.out.println(getName() + " goes to sleep.");
    }
}
