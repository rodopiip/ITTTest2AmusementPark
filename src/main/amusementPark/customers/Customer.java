package main.amusementPark.customers;

import main.amusementPark.AmusementPark;
import main.amusementPark.attractions.Attraction;

import java.util.Random;

public abstract class Customer {
    public enum CustomerType{CHILD, ADULT, ELDERLY}
    public enum CustomerGender{MALE, FEMALE}
    protected String name;
    protected int age;
    private boolean soulTaken = false;
    protected CustomerType customerType;
    protected CustomerGender customerGender;
    protected AmusementPark amusementPark;
    public Customer(String name, int age, CustomerType customerType, AmusementPark amusementPark) {
        this.name = name;
        this.age = age;
        this.customerType = customerType;
        this.customerGender = generateRandomGender();
        this.amusementPark = amusementPark;
        this.amusementPark.addCustomer(this);
        visitAttraction();
        visitAttraction();
    }

    public CustomerGender getCustomerGender() {
        return customerGender;
    }
    public boolean getSoul(){
        return this.soulTaken;
    }

    public void setSoulTaken(){
        this.soulTaken = true;
    }


    public CustomerType getCustomerType() {
        return customerType;
    }

    protected void visitAttraction(){
        //take random attraction from amusement park
        Attraction attraction = this.amusementPark.startRandomAttraction();
        pay(attraction);
    }
    protected void pay(Attraction attraction){
        attraction.increaseEarnings();
    }
    protected abstract int getDiscount();
    public CustomerGender generateRandomGender(){
        boolean genderChance = new Random().nextBoolean();
        this.customerGender = switch (genderChance){
            case 0 -> CustomerGender.MALE;
            default -> CustomerGender.FEMALE;

        };
        return this.customerGender;
    }
}
