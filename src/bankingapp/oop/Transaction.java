package bankingapp.oop;
import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {

    private final String transactionId;
    private final double amount;
    private final TransactionType transactionType;
    private final LocalDateTime dateOfTransaction;
    private final Account account;
    private final Account secondAccount;

    public Transaction(double amount, TransactionType transactionType, LocalDateTime dateOfTransaction, Account account) {
        this.transactionId = UUID.randomUUID().toString();
        this.amount = amount;
        this.transactionType = transactionType;
        this.dateOfTransaction = dateOfTransaction;
        this.account = account;
        this.secondAccount = null;
        if (transactionType == TransactionType.DEPOSIT){
            account.deposit(amount);
        }else{
            account.withdraw(amount);
        }
    }

    public Transaction(double amount, LocalDateTime dateOfTransaction, Account account, Account secondAccount) {
        this.transactionId = UUID.randomUUID().toString();
        this.amount = amount;
        this.transactionType = TransactionType.TRANSFER;
        this.dateOfTransaction = dateOfTransaction;
        this.account = account;
        this.secondAccount = secondAccount;
        this.account.transfer(amount, secondAccount);
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public LocalDateTime getDateOfTransaction() {
        return dateOfTransaction;
    }

    public Account getAccount() {
        return account;
    }

    public Account getSecondAccount() {
        return secondAccount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", amount=" + amount +
                ", transactionType=" + transactionType +
                ", dateOfTransaction=" + dateOfTransaction +
                ", account=" + account +
                ", secondAccount=" + secondAccount +
                '}';
    }
}
