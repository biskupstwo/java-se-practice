package exercises.CarpetCostCalculator;

public class Calculator {

    Carpet carpet;
    Floor floor;

    public Calculator(Carpet carpet, Floor floor) {
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalCost(){
        return this.carpet.getCost()*this.floor.getArea();
    }
}
