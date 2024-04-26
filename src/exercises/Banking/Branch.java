package exercises.Banking;

import java.util.ArrayList;

public class Branch {

    String name;
    ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction){
        Customer customer = new Customer(nameOfCustomer);
        customer.addTransaction(initialTransaction);
        return this.customers.contains(customer) && customer.transactions.contains(initialTransaction);
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction){

        int index = 0;
        for (int i = 0; i < this.customers.size(); i++){
            if (this.customers.get(i).getName().equals(nameOfCustomer)){
                this.customers.get(i).addTransaction(transaction);
                index = i;
                break;
            }
        }

        return this.customers.get(index).getTransactions().contains(transaction);
    }

    public Customer findCustomer(String nameOfCustomer){
        Customer customer = null;

        for (int i = 0; i < this.customers.size(); i++){
            if (this.customers.get(i).getName().equals(nameOfCustomer)){
                customer = this.customers.get(i);
                break;
            }
        }

        return customer;
    }
}