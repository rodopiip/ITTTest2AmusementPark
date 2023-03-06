package main.amusementPark.attractions;

import main.amusementPark.AmusementPark;
import main.amusementPark.beasts.Beast;
import main.customers.Customer;

import java.util.LinkedList;

public abstract class Attraction {
    public enum AttractionType {NORMAL, EXTREME}
    protected static int uniqueId = 1;
    protected AmusementPark amusementPark;
    protected int id;
    protected String name;
    protected int price;
    protected AttractionType attractionType;
    protected LinkedList<Customer> customers = new LinkedList<Customer>();
    protected Beast beast;
    protected int totalEarnings;
    protected int visits = 0;

    public Attraction(AmusementPark amusementPark,String name, AttractionType attractionType, Beast beast) {
        this.id = uniqueId++;
        this.amusementPark = amusementPark;
        this.beast = beast;
        this.name = name;
        this.attractionType = attractionType;
        addAttractionToPark();
    }

    public AttractionType getAttractionType() {
        return attractionType;
    }

    public String getName() {
        return name;
    }

    public int getVisits() {
        return visits;
    }

    public void increaseEarnings(){
        this.totalEarnings += price;
    }

    public int getTotalEarnings() {
        return totalEarnings;
    }
    private void increaseAttendance(){
        this.visits++;
    }

    public Beast getBeast() {
        return beast;
    }

    public Attraction(int id) {
        this.id = id;
    }

    protected void addAttractionToPark(){
        this.amusementPark.add(this);
    }
    protected abstract void amuseCustomer();
    protected abstract void makeLineOfCustomers();
    protected abstract void estimatePrice();
    protected abstract int chanceToAbductCustomer();
    protected abstract void admitCustomer();//todo extreme attractions not for children
}
