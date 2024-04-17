package bankingapp.oop;

public class Account {

    private static final String BANK_NAME = "ourBank"; //constant
    private String id;
    private double balance;
    private String holderName;
    private boolean isActive;

    public Account(String id, double balance, String holderName, boolean isActive){
        this.id = id;
        if (balance < 0){
            this.balance = 0;
        }else{
            this.balance = balance;
        }
        this.holderName = holderName;
        this.isActive = isActive;
    }

    public void inactiveAccount(){
        this.isActive = false;
    }

    public void deposit(double amount){
        if (!this.isActive){
            throw new UnsupportedOperationException("Account is inactive.");
        }
        if (amount < 0){
            System.out.println("Deposit amount is less than 0");
        }else{
            this.balance += amount;
        }
    }

    public void withdraw(double amount){
        if (!this.isActive){
            throw new UnsupportedOperationException("Account is inactive.");
        }
        if ((amount < 0 || amount > this.balance)){
            System.out.println("Operation can't be completed.");
        }else{
            this.balance -= amount;
        }
    }

    public void transfer(double amount, Account toAccount){
        if (!this.isActive){
            throw new UnsupportedOperationException("Account is inactive.");
        }else if(!toAccount.isActive){
            System.out.println("Receiver account is inactive.");
            return;
        }
        this.withdraw(amount);
        toAccount.deposit(amount);
    }

    public String getAccountInformation(){
        return this.toString();
    }
    @Override
    public String toString(){
        return "Account{id='" + this.id + "', balance=" + this.balance + ", holderName ='" + this.holderName + "', isActive=" + this.isActive + "}";
    }


    public String getBankName() {
        return BANK_NAME;
    }

    public String getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public String setHolderName(String newHolderName){
        return this.holderName = newHolderName;
    }

    public String getHolderName(){
        return this.holderName;
    }


    public String setId(String id) {
        return this.id = id;
    }

}