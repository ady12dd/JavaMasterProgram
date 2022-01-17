package InterfacesInnerClassAbstractClass.Interfaces;

import InterfacesInnerClassAbstractClass.Interfaces.InterfaceChallenge.ISaveable;
import InterfacesInnerClassAbstractClass.Interfaces.InterfaceChallenge.ISaveableCurs;
import InterfacesInnerClassAbstractClass.Interfaces.InterfaceChallenge.MonsterCurs;
import InterfacesInnerClassAbstractClass.Interfaces.InterfaceChallenge.PlayerCurs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Object> saveTheValues(ISaveable actor) {
        return actor.saveFile();
    }

    public static void printValuesSaved(ArrayList<Object> list) {
        for (Object a : list
        ) {
            System.out.println(a);
        }
    }

    public static ArrayList<String>readValues(){
        ArrayList<String>values=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        int index=0;
        System.out.println("Choose\n" +
                "1- enter a string\n" +
                "0- quit");
        while (!quit){
            System.out.println("Choose an option");
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("Please enter a string");
                    String value=scanner.nextLine();
                    values.add(index,value);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void savedObject(ISaveableCurs actor){
        for(int i=0;i<actor.write().size();i++){
            System.out.println("Saving "+actor.write().get(i)+" to storage device");
        }
    }

    public static void loadObject(ISaveableCurs actor){
        ArrayList<String>values=readValues();
        actor.read(values);
    }

    public static void main(String[] args) {
//        ITelephone timsPhone=new DeskPhone(123456);
//        timsPhone.powerOn();
//        timsPhone.callPhone(123456);
//        timsPhone.answer();
//
//        timsPhone=new MobilePhone(0766725547);
//        timsPhone.powerOn();
//        timsPhone.callPhone(0766725547);
//        timsPhone.answer();
//        ISaveable player1 = new Player("Adrian", 34);
//        ISaveable monster1 = new Monster("Bulbazar", 3);
//        printValuesSaved(saveTheValues(player1));
//        printValuesSaved(saveTheValues(monster1));
//        ArrayList<Object> list1 = saveTheValues(player1);
//        ArrayList<Object> list2 = saveTheValues(monster1);
//        ((Player) player1).setName("Mihai");
//        ((Monster) monster1).setName("Picachiu");
//        System.out.println(player1.toString() + monster1.toString());
//        player1.populate(list1);
//        monster1.populate(list2);
//        System.out.println("After saving and populate");
//        System.out.println(player1.toString() + monster1.toString());

        ISaveableCurs player1=new PlayerCurs("Adrian",100,5);
        savedObject(player1);
        loadObject(player1);
        System.out.println(player1);

        ISaveableCurs monster1=new MonsterCurs("Bulbazar",120,7);
        savedObject(monster1);
        loadObject(monster1);
        System.out.println(monster1);



    }
}
