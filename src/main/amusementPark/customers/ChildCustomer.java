package main.amusementPark.customers;

import main.amusementPark.AmusementPark;

public class ChildCustomer extends Customer{
    public ChildCustomer(String name, int age,AmusementPark amusementPark) {
        super(name, age, CustomerType.CHILD, amusementPark);
    }

    @Override
    protected void pay(AmusementPark park) {
        //todo validate attraction type
    }

    @Override
    protected int getDiscount() {
        return 50;
    }
}
