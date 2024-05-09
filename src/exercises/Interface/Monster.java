package exercises.Interface;

import java.util.List;

public class Monster implements IsSaveable{

    String name;
    int hitPoints;
    int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        return List.of(this.getName(), String.valueOf(this.getHitPoints()), String.valueOf(this.getStrength()));
    }

    @Override
    public void read(List<String> list) {
        if (!list.isEmpty() && list != null){
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}