package exercises.SimpleCalculator;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public SimpleCalculator(){

    }

    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public double setFirstNumber(double number){
        return this.firstNumber = number;
    }

    public double setSecondNumber(double number){
        return this.secondNumber = number;
    }

    public double getAdditionResult(){
        return this.firstNumber+this.secondNumber;
    }

    public double getSubtractionResult(){
        return this.firstNumber-this.secondNumber;
    }

    public double getMultiplicationResult(){
        return this.firstNumber*this.secondNumber;
    }

    public double getDivisionResult(){
        double result = 0;
        if (this.secondNumber != 0){
            result = this.firstNumber/this.secondNumber;
        }
        return result;
    }

}