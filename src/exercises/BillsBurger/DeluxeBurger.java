package exercises.BillsBurger;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe Hamburger", "Sausage & Bacon", 14.54, "White");
        addition1Name = "Chips";
        addition1Price = 2.75;
        System.out.println(String.format("Added %s for an extra %.2f", addition1Name, addition1Price));
        addition2Name = "Drink";
        addition2Price = 1.81;
        System.out.println(String.format("Added %s for an extra %.2f", addition2Name, addition2Price));

    }

    @Override
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price){
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price){
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price){
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public double itemizeHamburger(){
        return Math.round((price+addition1Price+addition2Price)*100.0) / 100.0;
    }
}
