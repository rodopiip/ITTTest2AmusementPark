package main.amusementPark.customers;

import main.amusementPark.AmusementPark;

public class AdultCustomer extends Customer{
    public AdultCustomer(String name, int age, AmusementPark amusementPark) {
        super(name, age, CustomerType.ADULT, amusementPark);
    }

    @Override
    protected void pay(AmusementPark park) {

    }

    @Override
    protected int getDiscount() {
        return 0;
    }
}
