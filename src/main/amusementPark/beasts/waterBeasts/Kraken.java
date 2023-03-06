package main.amusementPark.beasts.waterBeasts;

import main.amusementPark.beasts.WaterBeast;

public class Kraken extends WaterBeast {
    public static int totalEarnings;
    private int tentaclesLength;
    public Kraken(String name, int tentaclesLength) {
        super(BeastType.WATER, name);
        this.waterBeastKind = WaterBeastKind.KRAKEN;
        this.tentaclesLength = tentaclesLength;
    }

    @Override
    protected void amuse() {

    }
}
