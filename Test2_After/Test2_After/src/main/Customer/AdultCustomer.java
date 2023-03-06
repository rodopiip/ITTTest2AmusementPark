package main.Customer;

import main.AmusementPark;

public class AdultCustomer extends Customer{
    public AdultCustomer(AmusementPark amusementPark, String name, int age, Gender gender) {
        super(amusementPark, name, age, gender, CustomerType.ADULT);
    }

    @Override
    protected void attendAttraction() {

    }

    @Override
    protected void pay() {

    }
}
