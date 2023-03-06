package main.amusementPark.beasts.waterBeasts;

import main.amusementPark.beasts.WaterBeast;

public class Mermaid extends WaterBeast {
    public static int totalEarnings;
    private String color;
    public Mermaid(String name, String color) {
        super(BeastType.WATER, name, WaterBeastKind.MERMAID);
        this.waterBeastKind = WaterBeastKind.MERMAID;
        this.color = color;
    }

    @Override
    protected void amuse() {

    }
}
