package sessions.session5.inheritance;

public class TestEngineer extends Employee{

    private String ongoingProject;
    private boolean isOnBench;
    private String programmingLanguage;


    public TestEngineer(String employeeId, String firstName, String lastName, String ongoingProject, boolean isOnBench, String programmingLanguage) {
        super(employeeId, firstName, lastName);
        this.ongoingProject = ongoingProject;
        this.isOnBench = isOnBench;
        this.programmingLanguage = programmingLanguage;
    }

    public String getOngoingProject() {
        return ongoingProject;
    }

    public void setOngoingProject(String ongoingProject) {
        this.ongoingProject = ongoingProject;
    }

    public boolean getIsOnBench() {
        return isOnBench;
    }

    public void setOnBench(boolean onBench) {
        isOnBench = onBench;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }


    public void designingTestCases(String testCaseTitle){
        //write souf
        System.out.printf("%s %s working on test design for '%s'.\n", this.getFirstName(), this.getLastName(), testCaseTitle);
    }

    @Override
    public void displayInfo(){
        System.out.printf("Employee Id: %s, Full name: %s %s, Project: '%s', Is On Bench: %s, Programming Language: %s\n", getEmployeeId(), getFirstName(), getLastName(), getOngoingProject(), getIsOnBench(), getProgrammingLanguage());
    }

}
