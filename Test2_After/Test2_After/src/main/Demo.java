package main;

import java.beans.Customizer;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        //Създава се увеселителен парк „Krasi`s Fantastic Beasts“
        AmusementPark amusementPark = new AmusementPark("Krasi's Fantastic Beasts");
        //add attraction to list and beast to Attraction

        //Създават се по три нормални атракции с Кракен, Грифон и Джудже.

        //in method createAttraction() state type of attraction with enum
        //and type of beast with enum
        //add all beast types to a single enum
        //add all beast subtypes to a single enum
        amusementPark.createAttraction(AmusementPark.AttractionType.NORMAL, AmusementPark.BeastSubtype.KRAKEN));
        amusementPark.createAttraction(NORMAL, KRAKEN));
        amusementPark.createAttraction(NORMAL, GRIFFIN));
        amusementPark.createAttraction(NORMAL, GRIFFIN));
        amusementPark.createAttraction(NORMAL, DWARF));
        amusementPark.createAttraction(NORMAL, DWARF));

        //Създават се по две екстремни атракции с Русалка, Дракон и Дявол.

        amusementPark.createAttraction(EXTREME, MERMAID));
        amusementPark.createAttraction(EXTREME, MERMAID));
        amusementPark.createAttraction(EXTREME, DRAGON));
        amusementPark.createAttraction(EXTREME, DRAGON));
        amusementPark.createAttraction(EXTREME, DEVIL));
        amusementPark.createAttraction(EXTREME, DEVIL));

        //Създават се 100 клиента на произволен принцип – деца, възрастни или пенсионери

        for (int i = 0; i<100; i++){
            int customerChance = new Random().nextInt(3);
            Customer customer = switch (customerChance){
                case 0 -> new ChildCustomer();
                case 1 -> new ChildAdult();
                default -> new ElderlyCustomer();
            };
            amusementPark.addCustomer(customer);//todo add customer to customers list in amusement park

            //Всеки клиент посещава две произволни атракции.

            //validate if customer is compatible with attraction
            //if yes: put customer in the queue of a random attraction
            customer.attendAttraction();
            customer.attendAttraction();
        }

        //Всяка атракция „стартира“, като за всеки клиент от наредилите се, се изпълнява
        //коронният номер на звяра в нея.

        //iterate through list of attractions
        //in each attraction iterate through que of customers
        //entertain each customer (the beast.amuse())
        amusementPark.startAttractions();

        //Изваждат се статистики за работата на увеселителният парк.

        amusementPark.displayStats();
    }
}
