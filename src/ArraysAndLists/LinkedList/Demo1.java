package ArraysAndLists.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        LinkedList<String> placeToVisitAlphabeticaly = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Malbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canbera");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");
        placesToVisit.add("Sydney");

        printlist(placesToVisit);
        placesToVisit.add(1, "Alice Springs");
        printlist(placesToVisit);
        //placesToVisit.remove(4);
        placesToVisit.remove("Alice Springs");
        printlist(placesToVisit);

        addPlaceInOrder(placeToVisitAlphabeticaly, "Bucuresti");
        addPlaceInOrder(placeToVisitAlphabeticaly, "Zalau");
        addPlaceInOrder(placeToVisitAlphabeticaly, "Popesti-Leordeni");
        addPlaceInOrder(placeToVisitAlphabeticaly, "Arad");
        addPlaceInOrder(placeToVisitAlphabeticaly, "Timisoara");
        addPlaceInOrder(placeToVisitAlphabeticaly, "Buzau");
        addPlaceInOrder(placeToVisitAlphabeticaly, "Ploiesti");
        printlist(placeToVisitAlphabeticaly);
        System.out.println("Visit cities");
        visit(placeToVisitAlphabeticaly);


    }

    private static boolean addPlaceInOrder(LinkedList<String> linkedList, String city) {
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            int comparison = iterator.next().compareTo(city);
            if (comparison == 0) {
                System.out.println("The city already exists");
                return false;
            } else if (comparison > 0) {
                //newcity before this one
                iterator.previous();
                iterator.add(city);
                return true;
            }
        }
        linkedList.add(city);
        return true;
    }

    private static void printlist(LinkedList<String> placesToVisit) {
        Iterator<String> i = placesToVisit.iterator();//return a list of iterators into an iterator that can be user only forward
        int number = 0;
        while (i.hasNext()) {
            number++;
            System.out.println(number + ". Now visiting " + i.next());
        }
        System.out.println("=============================");
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward=true;
        ListIterator<String> iterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No cities on the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + iterator.next());
            printMenu();
        }
        while (!quit) {
            System.out.println("Please enter an option");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Vacation over");
                    quit=true;
                    break;
                case 1:
                    if(!goingForward){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                    }else{
                        goingForward=true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Now visiting " + iterator.next());
                    } else {
                        System.out.println("Vacation is over, no more cities");
                        goingForward=false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }else{
                            goingForward=false;
                        }
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Now visiting "+iterator.previous());
                    }else{
                        System.out.println("We are the start of the list");
                        goingForward=true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
                default:
                    System.out.println("Choose another option");
                    printMenu();
            }
        }

    }

    private static void printMenu(){
        System.out.println("=======Menu========");
        System.out.println("0-Quit\n" +
                "1-Move to the next city\n" +
                "2-Move to the previous city\n" +
                "3-Print menu\n");
    }
}
