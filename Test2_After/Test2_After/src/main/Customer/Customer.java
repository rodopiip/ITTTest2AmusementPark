package main.Customer;

import main.AmusementPark;

public abstract class Customer {
    public enum CustomerType{CHILD, ADULT, ELDERLY}
    public enum Gender{MALE, FEMALE}
    protected String name;
    protected int age;
    protected Gender gender;
    protected CustomerType customerType;
    protected AmusementPark amusementPark;

    public Customer(AmusementPark amusementPark, String name, int age, Gender gender, CustomerType customerType) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.customerType = customerType;
        this.amusementPark = amusementPark;
    }

    protected abstract void attendAttraction();
    protected abstract void pay();
    protected abstract int getDiscount();

}
