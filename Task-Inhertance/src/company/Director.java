package company;

public class Director extends Employee {

    private double budget;

    public Director(double budget, String name, String department, double salary) {

        super(name, department, salary);

        this.budget = budget;

    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public String toString() {
        return super.toString() + ", budget: " + budget;
    }
}
