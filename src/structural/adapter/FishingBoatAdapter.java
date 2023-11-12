package structural.adapter;

// adapter class
// adapts the interface of the fishingBoat into RowingBoat
public class FishingBoatAdapter implements RowingBoat {
    private final FishingBoat boat = new FishingBoat();

    @Override
    public void row() {
        boat.sail();
    }
}
