package sessions.session5.polymorphism;

public class Laptop implements Switchable{

    private boolean isOn;

    @Override
    public void switchOn() {
        if (!isOn){
            isOn = true;
            System.out.println("Laptop is on");
        }
    }

    @Override
    public void switchOff() {
        if (isOn){
            isOn = false;
            System.out.println("Laptop is off");
        }
    }


    public void sendEmail(){
        if (!isOn){
            System.out.println("Laptop is off");
        }else{
            System.out.println("Email sent!");
        }
    }
}
