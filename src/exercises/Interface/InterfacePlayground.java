package exercises.Interface;

import java.util.List;

public class InterfacePlayground {

    public static void main(String[] args) {

        Player johnPlayer = new Player("John", 20, 50);
        List<String> johnBackup = johnPlayer.write();
        System.out.println(johnPlayer);
        johnPlayer.setName("Joe");
        johnPlayer.setHitPoints(400);
        System.out.println(johnPlayer);
        johnPlayer.read(johnBackup);
        System.out.println(johnPlayer);


        Monster werewolf = new Monster("Werewolf", 20, 40);
        List<String> werewolfBackup = werewolf.write();
        System.out.println(werewolf);
        werewolf.name = "Doge";
        System.out.println(werewolf);
        werewolf.read(werewolfBackup);
        System.out.println(werewolf);
    }
}
