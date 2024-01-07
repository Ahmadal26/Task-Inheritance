package company;

public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, String department, double salary, int teamSize) {

        super(name, department, salary);

        this.teamSize = teamSize;

    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public String toString() {
        return super.toString() + ", Team Size: " + teamSize;
    }

}
