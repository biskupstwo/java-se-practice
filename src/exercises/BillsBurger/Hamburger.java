package exercises.BillsBurger;

public class Hamburger {

    String name;
    String meat;
    double price;
    String breadRollType;

    String addition1Name;
    double addition1Price;
    String addition2Name;
    double addition2Price;
    String addition3Name;
    double addition3Price;
    String addition4Name;
    double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(String.format("%s on a %s roll with %s, price is %.2f", name, breadRollType, meat, price));
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.println(String.format("Added %s for an extra %.2f", name, price));
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.println(String.format("Added %s for an extra %.2f", name, price));
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.println(String.format("Added %s for an extra %.2f", name, price));
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.println(String.format("Added %s for an extra %.2f", name, price));
    }

    public double itemizeHamburger(){
        return this.price+this.addition1Price+this.addition2Price+this.addition3Price+this.addition4Price;
    }
}
