package main.Customer;

import main.AmusementPark;

public class ElderlyCustomer extends Customer{
    public ElderlyCustomer(AmusementPark amusementPark, String name, int age, Gender gender) {
        super(amusementPark, name, age, gender, CustomerType.ELDERLY);
    }

    @Override
    protected void attendAttraction() {

    }

    @Override
    protected void pay() {

    }
}
