package main.amusementPark.attractions;

import main.amusementPark.AmusementPark;
import main.amusementPark.beasts.Beast;

public class NormalAttraction extends Attraction{
    public NormalAttraction(AmusementPark amusementPark, String name, AttractionType attractionType, Beast beast) {
        super(amusementPark, name, attractionType, beast);
    }

    @Override
    protected void amuseCustomer() {

    }

    @Override
    protected void makeLineOfCustomers() {

    }

    @Override
    protected void estimatePrice() {

    }

    @Override
    protected int chanceToAbductCustomer() {
        return 0;
    }

    @Override
    protected void admitCustomer() {

    }
}
