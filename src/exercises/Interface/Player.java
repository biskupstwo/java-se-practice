package exercises.Interface;

import java.util.List;

public class Player implements IsSaveable{

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }




    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        return List.of(this.getName(), this.getWeapon(), String.valueOf(this.getHitPoints()), String.valueOf(this.getStrength()));
    }

    @Override
    public void read(List<String> list) {
        if (!list.isEmpty() && list != null){
            this.setName(list.get(0));
            this.setWeapon(list.get(1));
            this.setHitPoints(Integer.parseInt(list.get(2)));
            this.setStrength(Integer.parseInt(list.get(3)));
        }
    }
}