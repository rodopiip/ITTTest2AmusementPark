package main;

import main.Customer.Customer;

import java.util.HashSet;
import java.util.Set;

public class AmusementPark {
    public enum BeastType {EARTH, AIR, WATER}
    public enum BeastSubtype {DEVIL, DWARF, GRIFFIN, DRAGON, MERMAID, KRAKEN}
    public enum AttractionType{NORMAL, EXTREME};
    private String name;
    private Set<Customer> customers = new HashSet<>();

    public AmusementPark(String name) {
        this.name = name;
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    //in method createAttraction() state type of attraction with enum
    //and type of beast with enum
    //add all beast types to a single enum
    //add all beast subtypes to a single enum
    public void createAttraction(AttractionType, BeastSubtype){
        Attraction attraction = switch (AttractionType){
            case AttractionType.NORMAL -> new NormalAttraction(BeastSubtype);//todo
            case default -> new ExtremeAttraction(BeastSubtype);//todo
        };
    }
}
