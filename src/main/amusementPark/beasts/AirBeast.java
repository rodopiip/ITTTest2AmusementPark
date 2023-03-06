package main.amusementPark.beasts;

public abstract class AirBeast extends Beast{
    public enum AirBeastKind{DRAGON, GRIFFIN};
    protected int flightSpeed;
    AirBeast(String name) {
        super(BeastType.AIR, name);
    }
    protected abstract void fly();
}
