package InterfacesInnerClassAbstractClass.Interfaces.InterfaceChallenge;

import java.util.ArrayList;

public class Monster implements ISaveable {
    private String name;
    private int difficulty;

    public Monster(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public ArrayList<Object> saveFile() {
        ArrayList<Object> list = new ArrayList<>();
        list.add(this.name);
        list.add(this.difficulty);
        return list;
    }

    @Override
    public void populate(ArrayList<Object> listOfObjects) {
        this.name = (String) listOfObjects.get(0);
        this.difficulty = (int) listOfObjects.get(1);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", difficulty=" + difficulty +
                '}';
    }
}
