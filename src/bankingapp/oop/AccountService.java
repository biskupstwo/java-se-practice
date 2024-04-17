package bankingapp.oop;

import java.util.ArrayList;
import java.util.UUID;

public class AccountService {

    ArrayList<Account> accountsRepo = new ArrayList<>();

    public Account createAccount(double balance, String holderName){
        String accountId = UUID.randomUUID().toString();
        boolean defaultAccountStatus = true;
        Account acc = new Account(accountId, balance, holderName, defaultAccountStatus);
        accountsRepo.add(acc);
        return acc;
    }

    public void updateAccountHolderName(String accountId, String newHolderName){
        Account account = getAccountById(accountId);
        account.setHolderName(newHolderName);

    }

    public Account getAccountById(String accountId){
        for (Account acc : accountsRepo){
            if (acc.getId().equals(accountId)) return acc;
        }
        return null;
    }

    public void deleteAccount(String accountId){
        for (Account acc : accountsRepo){
            if (acc.getId().equals(accountId)){
                accountsRepo.remove(acc);
                return;
            }
        }

    }
}
