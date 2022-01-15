package ArraysAndLists.LinkedList;

public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer(Customer c){
        Customer customer=new Customer(c.name,c.balance);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Customer customer=new Customer(this);
        return customer;
    }
}
