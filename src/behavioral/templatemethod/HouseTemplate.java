package behavioral.templatemethod;

public abstract class HouseTemplate {
    // template method
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
    }

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods and sand");
    }

    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    protected abstract void buildPillars();

    protected abstract void buildWalls();
}
