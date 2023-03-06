package main.amusementPark.beasts.earthBeasts;

import main.amusementPark.beasts.EarthBeast;
import main.amusementPark.customers.Customer;

public class Devil extends EarthBeast {
    public static int totalEarnings;
    void takeSoul(Customer customer){
        customer.setSoulTaken();
    }
    //todo inheritance
}
