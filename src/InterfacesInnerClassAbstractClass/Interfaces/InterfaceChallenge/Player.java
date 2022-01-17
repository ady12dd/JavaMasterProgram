package InterfacesInnerClassAbstractClass.Interfaces.InterfaceChallenge;

import java.util.ArrayList;

public class Player implements ISaveable {
    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public ArrayList<Object> saveFile() {
        ArrayList<Object> list = new ArrayList<>();
        list.add(this.name);
        list.add(this.age);
        return list;
    }

    @Override
    public void populate(ArrayList<Object> listOfObjects) {
        this.name = (String) listOfObjects.get(0);
        this.age = (int) listOfObjects.get(1);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
