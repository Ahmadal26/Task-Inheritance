package company;

public class Main {
    public static void main(String[] args)

    {

        String[] strArray = new String[] { "VHDL", "Python", "Java", "C++" };

        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");
        Engineer Ahmad = new Engineer("Ahmad", "IT", 2000, strArray);
        Director Osama = new Director(2000, "Ahmad", "Planning", 1200);
        SalesPerson Wahab = new SalesPerson("Wahab", "Markting", 1300, 5000);

        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
        System.out.println(Ahmad);
        System.out.println(Osama);
        System.out.println(Wahab);

    }

}
