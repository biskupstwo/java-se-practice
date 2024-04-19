package sessions.session5.inheritance;

public class Employee {

    private String firstName;
    private String lastName;
    private String employeeId;

    public Employee(String employeeId, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }


    public void work(){
        System.out.printf("%s %s is working.\n", getFirstName(), getLastName());
    }

    public void takeBreak(){
        System.out.printf("%s %s is taking break and relaxing.\n", getFirstName(), getLastName());
    }

    public void displayInfo(){
        System.out.printf("Employee Id: %s, Full name: %s %s\n", getEmployeeId(), getFirstName(), getLastName());
    }
}
