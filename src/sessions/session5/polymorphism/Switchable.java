package sessions.session5.polymorphism;

public interface Switchable {
    int INTERFACE_CONSTANT = 7;
    default String getManufacturer(){return "";};

    static void printConstant(){
        System.out.println(INTERFACE_CONSTANT);
    }
    void switchOn();
    void switchOff();
}
