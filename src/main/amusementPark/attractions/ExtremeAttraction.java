package main.amusementPark.attractions;

import main.amusementPark.AmusementPark;
import main.amusementPark.beasts.Beast;

public class ExtremeAttraction extends Attraction{
    public ExtremeAttraction(AmusementPark amusementPark,String name, Beast beast) {
        super(amusementPark, name, AttractionType.EXTREME, beast);

    }

    @Override
    protected void amuseCustomer() {

    }

    @Override
    protected void makeLineOfCustomers() {

    }

    @Override
    protected void estimatePrice() {
        //todo
    }

    @Override
    protected int chanceToAbductCustomer() {
        return 10;
    }

    @Override
    protected void admitCustomer() {
        //take random customer
        this.customers.getFirst();
        //take in line only if not child
        //todo not for Children
    }
}
