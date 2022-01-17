package InterfacesInnerClassAbstractClass.Interfaces.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class MonsterCurs implements ISaveableCurs {
    private String name;
    private int hitPoints;
    private int strenght;

    public MonsterCurs(String name, int hitPoints, int strenght) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strenght = strenght;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MonsterCurs{");
        sb.append("name='").append(name).append('\'');
        sb.append(", hitPoints=").append(hitPoints);
        sb.append(", strenght=").append(strenght);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public List<String> write() {
        List<String> saved = new ArrayList<>();
        saved.add(0, this.name);
        saved.add(1, String.valueOf(this.hitPoints));
        saved.add(2, String.valueOf(this.strenght));
        return saved;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strenght = Integer.parseInt(savedValues.get(2));
        }
    }
}
