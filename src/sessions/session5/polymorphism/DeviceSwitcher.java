package sessions.session5.polymorphism;

public class DeviceSwitcher {
    public static void main(String[] args) {
        //Switchable laptop = new Laptop();
        //Switchable smartphone = new Smartphone();
        Laptop laptop = new Laptop();
        Smartphone smartphone = new Smartphone();
        laptop.switchOn();
        smartphone.switchOn();
        smartphone.call();
        laptop.sendEmail();
        checkIfCanBeSwitched(laptop);
        checkIfCanBeSwitched(smartphone);
    }

    public static void checkIfCanBeSwitched(Switchable device){
        device.switchOn();
        device.switchOff();
    }
}
