package exercises.BillsBurger;

public class HealthyBurger extends Hamburger{

    String healthyExtra1Name;
    double healthyExtra1Price;
    String healthyExtra2Name;
    double healthyExtra2Price;
    public HealthyBurger(String meat, double price) {
        super("Healthy hamburger", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println(String.format("Added %s for an extra %.2f", name, price));
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.println(String.format("Added %s for an extra %.2f", name, price));
    }

    @Override
    public double itemizeHamburger(){
        return this.price+this.addition1Price+this.addition2Price+this.addition3Price+this.addition4Price+this.healthyExtra1Price+this.healthyExtra2Price;
    }
}
