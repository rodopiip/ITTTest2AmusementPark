package main.amusementPark.beasts;

public abstract class EarthBeast extends Beast{
    public enum EarthBeastKind{DEVIL, DWARF};
    EarthBeast(String name) {
        super(BeastType.EARTH, name);
    }
}
