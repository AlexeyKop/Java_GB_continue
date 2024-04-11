public class PrizeToySelector {
    private ToyManager toyManager;

    public PrizeToySelector(ToyManager toyManager) {
        this.toyManager = toyManager;
    }

    public Toy selectPrizeToy() {
        return toyManager.getPrizeToy();
    }
}
