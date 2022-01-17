package InterfacesInnerClassAbstractClass.Interfaces.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class PlayerCurs implements ISaveableCurs {
    private String name;
    protected int hitPoints;
    private int strenght;
    private String weapon;

    public PlayerCurs(String name, int hitPoints, int strenght) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strenght = strenght;
        this.weapon="sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "PlayerCurs{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strenght=" + strenght +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values=new ArrayList<>();
        values.add(0,this.name);
        values.add(1,String.valueOf(this.hitPoints));
        values.add(2,String.valueOf(this.strenght));
        values.add(3,this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues!=null && savedValues.size()>0){
            this.name=savedValues.get(0);
            this.hitPoints=Integer.parseInt(savedValues.get(1));
            this.strenght=Integer.parseInt(savedValues.get(2));
            this.weapon=savedValues.get(3);
        }
    }
}
