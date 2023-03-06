package main.Customer;

import main.AmusementPark;

public class ChildCustomer extends Customer{
    public ChildCustomer(AmusementPark amusementPark, String name, int age, Gender gender) {
        super(amusementPark, name, age, gender, CustomerType.CHILD);
    }

    @Override
    protected void attendAttraction() {

    }

    @Override
    protected void pay() {

    }
}
