package company;

public class SalesPerson extends Employee {

    private int saleTarget;

    public SalesPerson(String name, String department, double salary, int saleTarget) {

        super(name, department, salary);
        this.saleTarget = saleTarget;
    }

    public void setSaleTarget(int saleTarget) {
        this.saleTarget = saleTarget;
    }

    public int getSaleTarget() {
        return saleTarget;

    }

    public String toString() {
        return super.toString() + ", Sale Target: " + saleTarget;
    }
}
