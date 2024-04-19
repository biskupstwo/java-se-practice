package sessions.session5.inheritance;

public class EmployeeManagementSystem {
    //write psvm
    public static void main(String[] args) {
        Employee johnDoe = new Employee("7","John","Doe");
        Employee janeSmith = new Employee("123","Jane","Smith");
        janeSmith.takeBreak();
        johnDoe.work();
        johnDoe.displayInfo();
        janeSmith.displayInfo();
        Manager garrySmith = new Manager("1234","Garry", "Smith", "OurBank Account Management System", 7);
        TestEngineer mollyBlack = new TestEngineer("5674", "Molly","Black", "OurBank Account Management System", false, "Java 22");
        garrySmith.conductMeeting();
        mollyBlack.designingTestCases("Create account for client");
        mollyBlack.displayInfo();
        garrySmith.displayInfo();
        Employee garrySmithEmp = new Manager("1235","Garry", "Smith", "OurBank Account Management System", 7);
        Employee garrySmithRef = garrySmith;
        Manager garrySmithManRef = (Manager) garrySmithRef;
        ((Manager) garrySmithRef).conductMeeting();
        garrySmithManRef.conductMeeting();
    }
}
