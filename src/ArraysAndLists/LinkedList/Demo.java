package ArraysAndLists.LinkedList;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        LinkedList<String> test = new LinkedList<>();
//        placesToVisit.add("Sydnei");
//        placesToVisit.add("Malbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("CAnberra");
//        placesToVisit.add("Darwin");
        addInOrder(placesToVisit, "Sydnei");
        addInOrder(placesToVisit, "Malbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Darwin");


        printList(placesToVisit);
        placesToVisit.add(1, "Alice Spring");
        printList(placesToVisit);
        placesToVisit.remove(4);
        printList(placesToVisit);
        addInOrder(placesToVisit, "Bucuresti");
        printList(placesToVisit);
        visit(placesToVisit);
        visit(test);


    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.listIterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }

        System.out.println("=========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //equal,do not add
                System.out.println("New city " + newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //new city shoul apppear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> linkedList) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please insert a city");
            String city = scanner.nextLine();
            ListIterator<String> listIterator = linkedList.listIterator();
            if (linkedList.getFirst() != null) {
                while (listIterator.hasNext()) {
                    if (listIterator.next().compareTo(city) == 0) {
                        System.out.println("The city " + city + " was found");
                        break;
                    }
                }
                System.out.println("The city that you are looking for does not exist in the list");
            }

        } catch (NoSuchElementException e) {
            System.out.println("The list is empty");
            e.printStackTrace();
        }

    }


}
