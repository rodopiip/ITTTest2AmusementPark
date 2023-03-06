package main.amusementPark.beasts;

public abstract class WaterBeast extends Beast {
    public enum WaterBeastKind{MERMAID, KRAKEN};
    protected int divingDepth;
    protected WaterBeastKind waterBeastKind;
    WaterBeast(BeastType name, WaterBeastKind waterBeastKind) {
        super(BeastType.WATER, name);
        this.waterBeastKind = waterBeastKind;
    }

}
