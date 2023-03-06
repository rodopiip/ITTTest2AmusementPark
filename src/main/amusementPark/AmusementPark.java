package main.amusementPark;

import main.amusementPark.attractions.Attraction;
import main.amusementPark.beasts.Beast;
import main.amusementPark.customers.Customer;

import java.util.*;

public class AmusementPark {
    private String name;
    private Set<Attraction> attractions = new HashSet<>();
    private LinkedList<Customer> customers = new LinkedList<>();
    private Map<Beast.BeastType, Map<Beast, Integer>> rankings = new TreeMap<>();
    Map<Beast, Integer>priceList = new HashMap<>();//todo override
    public AmusementPark(String name){
        this.name = name;
    }
    public void add(Attraction attraction){
        this.attractions.add(attraction);
    }
    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public Attraction startRandomAttraction(){
        Optional<Attraction> attraction = this.attractions.stream().findAny();
        attraction.getBeast().amuse();
        return attraction;
    }
    public void getStats(){
        stat1();
        stat2();
        stat3();
        stat4();
        stat5();
        stat6();
        stat7();
        stat8();

    }

    private void stat5() {
        System.out.println("Брой души, които дяволите са взели на възрастни жени.");
        int count = 0;
        customers.stream()
                .filter(p -> p.getCustomerGender() == Customer.CustomerGender.FEMALE)
                .filter(p -> p.getSoul()==true)
                .forEach(p -> count++);//може и с reduce
        System.out.println(count);
    }

    private void stat3() {
        System.out.println("Името на най-посещаваната атракция нормална и на най-посещаваната екстремна\n" +
                "атракция");
        //extreme
        Optional<Attraction> mostVisitedNormalAttraction = this.attractions.stream()
                .filter(p -> p.getAttractionType()== Attraction.AttractionType.EXTREME)
                .sorted((o1, o2) -> o2.getVisits() - o1.getVisits())
                .findFirst();
        System.out.println(mostVisitedNormalAttraction.getName());
    }

    private void stat2() {
        System.out.print("Общ брой приходи от атракции: ");
        int totalEarnings = 0;
        for (Attraction attraction : this.attractions){
            totalEarnings += attraction.getTotalEarnings();
        }
        System.out.println(totalEarnings);
    }

    private void stat1(){
        System.out.print("Брой деца, посетили парка: ");
        long kids = this.customers.stream()
                .filter(p -> p.getCustomerType()== Customer.CustomerType.CHILD)
                .count();
        System.out.println(kids);
    }
}
