package exercises.Banking;

import java.util.ArrayList;

public class Bank {

    String name;
    ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches =  new ArrayList<Branch>();
    }

    public boolean addBranch(String nameOfTheBranch){
        Branch branch = new Branch(nameOfTheBranch);
        return this.branches.add(branch);
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double transaction){
        boolean result = false;
        Customer customer = new Customer(nameOfCustomer);
        customer.addTransaction(transaction);

        for (int i = 0; i < this.branches.size(); i++){
            if (this.branches.get(i).getName().equals(nameOfBranch)){
                System.out.println(this.branches.get(i).getName());
                result = this.branches.get(i).customers.add(customer);
                if (result) break;
            }
        }
        return result;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transaction){

        boolean result = false;
        Customer customer = null;

        for (int i = 0; i < this.branches.size(); i++){
            if (this.branches.get(i).getName().equals(nameOfBranch)){
                this.branches.get(i).addCustomerTransaction(nameOfCustomer, transaction);
                customer = this.branches.get(i).findCustomer(nameOfCustomer);
                result = customer.transactions.contains(transaction) ? true : false;
                if (result) break;
            }
        }
        return result;
    }

    public Branch findBranch(String nameOfBranch){

        Branch branch = null;

        for (int i = 0; i < this.branches.size(); i++){
            if (this.branches.get(i).getName().equals(nameOfBranch)){
                branch = this.branches.get(i);
                break;
            }
        }

        return branch;
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransactions){
        boolean result = false;
        Branch branch = findBranch(nameOfBranch);
        Customer customer = null;
        if (branch != null){
            if (!printTransactions) System.out.printf("Customer details for branch %s\n", nameOfBranch);
            for (int i = 0; i < branch.customers.size(); i++){
                customer = branch.customers.get(i);
                System.out.printf("Customer: %s[%d]\n", customer.getName(), i+1);
                if (printTransactions) {
                    System.out.println("Transactions");
                    for (int j = 0; j < customer.getTransactions().size(); j++) {
                        System.out.printf("[%d]  Amount %.2f\n", j + 1, customer.getTransactions().get(j));
                    }
                }
            }
        }
        return result;
    }
}