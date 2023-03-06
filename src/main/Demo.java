package main;

import main.amusementPark.AmusementPark;
import main.amusementPark.attractions.Attraction;
import main.amusementPark.attractions.ExtremeAttraction;
import main.amusementPark.attractions.NormalAttraction;
import main.amusementPark.beasts.AirBeast;
import main.amusementPark.beasts.EarthBeast;
import main.amusementPark.beasts.WaterBeast;
import main.amusementPark.beasts.airBeasts.Griffin;
import main.amusementPark.beasts.waterBeasts.Kraken;
import main.amusementPark.beasts.waterBeasts.Mermaid;
import main.amusementPark.customers.AdultCustomer;
import main.amusementPark.customers.ChildCustomer;
import main.amusementPark.customers.Customer;
import main.amusementPark.customers.ElderlyCustomer;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        AmusementPark amusementPark  = new AmusementPark("Krasi's Fantastic Beasts");

        Attraction attraction1 = new NormalAttraction(amusementPark, "Attraction1",new Kraken());//todo constructor
        Attraction attraction2 = new NormalAttraction(amusementPark,"Attraction2",new Kraken());//todo constructor
        Attraction attraction3 = new NormalAttraction(amusementPark,"Attraction3",new Griffin());//todo constuctor
        Attraction attraction4 = new NormalAttraction(amusementPark,"Attraction4",new Griffin());//todo constuctor
        Attraction attraction5 = new NormalAttraction(amusementPark,"Attraction5",new Dwarf());//todo constuctor
        Attraction attraction6 = new NormalAttraction(amusementPark,"Attraction6",new Dwarf());//todo constuctor

        Attraction attraction7 = new ExtremeAttraction(amusementPark,"Attraction7",new Mermaid());
        Attraction attraction8 = new ExtremeAttraction(amusementPark,"Attraction8",new Mermaid());
        Attraction attraction9 = new ExtremeAttraction(amusementPark,"Attraction8",new Mermaid());
        Attraction attraction10 = new ExtremeAttraction(amusementPark,"Attraction8",new Mermaid());
        Attraction attraction11 = new ExtremeAttraction(amusementPark,"Attraction8",new Mermaid());
        Attraction attraction12 = new ExtremeAttraction(amusementPark,"Attraction8",new Mermaid());

        for(int i = 0; i<100; i++){
            int customerChance = new Random().nextInt(3);
            Customer customer = switch (customerChance){
                case 0 -> new AdultCustomer("AdultCustome "+i, i, amusementPark);
                case 1 -> new ChildCustomer("ChildCustome "+i, i, amusementPark);
                default -> new ElderlyCustomer("ElderlyCustome "+i, i, amusementPark);
            };
        }

        amusementPark.getStats();

    }
}
