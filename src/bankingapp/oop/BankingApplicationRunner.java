package bankingapp.oop;

public class BankingApplicationRunner {

    public static void main(String[] args){
        Account testAccount = new Account("12234",2000.00, "Jan Be", true);
        //testAccount.inactiveAccount();
        Account secondTestAccount= new Account("12235",2000.00, "Jan Be", true);
        double depositAmount = 137.00;
        double withdrawAmount = 137.00;
        double balanceAfterDeposit = 2137.00;
        double balanceAfterWithdraw = 2000.00;
        double invalidAmount = -137.00;


        testAccount.deposit(depositAmount);
        System.out.println(testAccount.getBalance());
        System.out.println(testAccount);

        System.out.println(testAccount.getBalance() == balanceAfterDeposit);

        testAccount.withdraw(withdrawAmount);
        System.out.println(testAccount.getBalance());
        System.out.println(testAccount);
        System.out.println("Bank: " + testAccount.getBankName());

        System.out.println(testAccount.getBalance() == balanceAfterWithdraw);

        System.out.println(testAccount);
        System.out.println(secondTestAccount);
        testAccount.transfer(withdrawAmount,secondTestAccount);
        System.out.println(testAccount);
        System.out.println(secondTestAccount);

        secondTestAccount.inactiveAccount();
        testAccount.transfer(withdrawAmount,secondTestAccount);
        System.out.println(testAccount);
        System.out.println(secondTestAccount);
    }
}
