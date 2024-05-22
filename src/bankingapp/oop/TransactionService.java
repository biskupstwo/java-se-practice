package bankingapp.oop;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TransactionService {

    ArrayList<Transaction> transactionsRepo = new ArrayList<>();



    public void viewAllTransactions(){
        this.transactionsRepo.forEach(System.out::println);
    }

    public void viewAllTransactionFilteredByTimePeriod(LocalDateTime start, LocalDateTime stop){
        List<Transaction> transactionsFiltered = this.transactionsRepo.stream().filter(transaction -> transaction.getDateOfTransaction().isAfter(start) && transaction.getDateOfTransaction().isBefore(stop)).toList();
        for (Transaction transaction : transactionsFiltered) {
            System.out.println(transaction);
        }
    }

    public void viewAllTransactionFilteredByType(TransactionType transactionType){
        List<Transaction> transactionsFiltered = this.transactionsRepo.stream().filter(transaction -> transaction.getTransactionType() == transactionType).toList();
        for (Transaction transaction : transactionsFiltered) {
            System.out.println(transaction);
        }
    }

    public Transaction getTransactionById(String idToFind){
        Transaction transactionToReturn = null;

        for (Transaction transaction : this.transactionsRepo) {
            if (transaction.getTransactionId().equals(idToFind)) {
                transactionToReturn = transaction;
                break;
            }
        }

        return transactionToReturn;
    }
}
