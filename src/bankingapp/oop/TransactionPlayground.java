package bankingapp.oop;

import java.time.LocalDateTime;

public class TransactionPlayground {

    public static void main(String[] args) {
        // Create accounts
        AccountService accountService = new AccountService();
        Account account1 = accountService.createAccount(1000.00,"Jan Be");
        Account account2 = accountService.createAccount(500.00,"Jan Be");

        System.out.println(account1);
        System.out.println(account2);

        // Create TransactionService
        TransactionService transactionService = new TransactionService();

        // Perform some transactions
        Transaction t1 = new Transaction(200.0, TransactionType.DEPOSIT, LocalDateTime.now().minusDays(1), account1);
        Transaction t2 = new Transaction(100.0, TransactionType.WITHDRAW, LocalDateTime.now().minusDays(2), account1);
        Transaction t3 = new Transaction(150.0, LocalDateTime.now(), account1, account2);

        System.out.println(account1);
        System.out.println(account2);

        // Add transactions to the service
        transactionService.transactionsRepo.add(t1);
        transactionService.transactionsRepo.add(t2);
        transactionService.transactionsRepo.add(t3);


        System.out.println("All Transactions:");
        transactionService.viewAllTransactions();


        System.out.println("\nTransactions in the last 2 days:");
        transactionService.viewAllTransactionFilteredByTimePeriod(LocalDateTime.now().minusDays(2), LocalDateTime.now());


        System.out.println("\nDeposit Transactions:");
        transactionService.viewAllTransactionFilteredByType(TransactionType.DEPOSIT);


        System.out.println("\nTransaction with ID " + t1.getTransactionId() + ":");
        Transaction foundTransaction = transactionService.getTransactionById(t1.getTransactionId());
        System.out.println(foundTransaction);
    }
}
