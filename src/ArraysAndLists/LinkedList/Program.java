package ArraysAndLists.LinkedList;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) throws CloneNotSupportedException {
        Customer customer = new Customer("Adrian", 54.96);
        Customer customer1 = (Customer) customer.clone();
        customer1.setBalance(12.10);
        System.out.println("Balance for customer: " + customer.getBalance());
        System.out.println("Balance for customer1: " + customer1.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }

        intList.add(1,2);
        System.out.println("\\\\\\\\\\\\\\\\");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
    }
}
