package main.amusementPark.customers;

import main.amusementPark.AmusementPark;

public class ElderlyCustomer extends Customer{
    public ElderlyCustomer(String name, int age, AmusementPark amusementPark) {
        super(name, age, CustomerType.ELDERLY, amusementPark);
    }

    @Override
    protected void pay(AmusementPark park) {

    }

    @Override
    protected int getDiscount() {
        return 80;
    }
}
