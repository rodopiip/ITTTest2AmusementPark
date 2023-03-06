package main.amusementPark.beasts;

import java.util.Objects;

public abstract class Beast {
    public enum BeastType{WATER, AIR, EARTH}
    public static int uniqueId = 1;
    protected int id;
    protected int pricePerVisit;
    protected String name;
    protected BeastType beastType;
    protected int age;
    Beast(BeastType beastType, String name){
        this.beastType = beastType;
        this.name = name;
        this.id = uniqueId++;
    }
    protected abstract void amuse();//todo override
    protected abstract showAbility();//todo override

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beast beast = (Beast) o;
        return id == beast.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getPricePerVisit() {
        return pricePerVisit;
    }
}
