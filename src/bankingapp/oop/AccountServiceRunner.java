package bankingapp.oop;

public class AccountServiceRunner {
    public static void main(String[] args){
        AccountService accountService = new AccountService();
        Account jansAccount = accountService.createAccount(1000.00,"Jan Be");
        System.out.println(jansAccount.getId());
        System.out.println(accountService.accountsRepo);
        String newHolderName = "Mr Jan Be";
        accountService.updateAccountHolderName(jansAccount.getId(), newHolderName);

        System.out.println(jansAccount.getHolderName().equals(newHolderName));

        Account jansAccount2 = accountService.getAccountById(jansAccount.getId());
        System.out.println(jansAccount2.getHolderName().equals(newHolderName));
        accountService.deleteAccount(jansAccount.getId());
        System.out.println((accountService.getAccountById(jansAccount.getId()) == null));
        System.out.println(accountService.getAccountById(jansAccount.getId()));
    }
}
