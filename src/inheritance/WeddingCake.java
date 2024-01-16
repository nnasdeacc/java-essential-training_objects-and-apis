package inheritance;

public class WeddingCake extends Cake {
    protected int tiers;

    public WeddingCake() {
        super("Almond");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
