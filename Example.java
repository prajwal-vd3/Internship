class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Salary extends Teacher {
    private double salary;

    public Salary(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Example {
    public static void main(String[] args) {
        Salary s = new Salary("Speed", 500);

        System.out.println("Name : " + s.getName());
        System.out.println("Salary : " + s.getSalary());
    }
}
