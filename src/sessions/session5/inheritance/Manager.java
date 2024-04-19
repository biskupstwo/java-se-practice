package sessions.session5.inheritance;

public class Manager extends Employee{


    private String project;
    private int teamSize;

    public Manager(String employeeId, String firstName, String lastName, String project, int teamSize) {
        super(employeeId, firstName, lastName);
        this.project = project;
        this.teamSize = teamSize;
    }

    public void conductMeeting(){
        System.out.printf("%s %s on the meeting now.\n", this.getFirstName(), this.getLastName());
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void displayInfo(){
        System.out.printf("Employee Id: %s, Full name: %s %s, Project: '%s', Team size: %d\n", getEmployeeId(), getFirstName(), getLastName(), getProject(), getTeamSize());
    }
}
