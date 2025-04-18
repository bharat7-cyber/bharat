class Employee {
    String name, address, jobTitle;
    double salary;

    Employee(String name, String address, String jobTitle, double salary) {
        this.name = name;
        this.address = address;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void generateReport() {
        System.out.println("Generating report for " + name);
    }
}

class Manager extends Employee {
    Manager(String name, String address, double salary) {
        super(name, address, "Manager", salary);
    }

    void manageProject() {
        System.out.println("Managing project");
    }
}

class Developer extends Employee {
    Developer(String name, String address, double salary) {
        super(name, address, "Developer", salary);
    }

    void writeCode() {
        System.out.println("Writing code");
    }
}

class Programmer extends Employee {
    Programmer(String name, String address, double salary) {
        super(name, address, "Programmer", salary);
    }

    void debugCode() {
        System.out.println("Debugging code");
    }
}

public class Q10 {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", "Pune", 80000);
        mgr.generateReport();
        mgr.manageProject();

        Developer dev = new Developer("Bob", "Delhi", 70000);
        dev.generateReport();
        dev.writeCode();

        Programmer prog = new Programmer("Charlie", "Mumbai", 65000);
        prog.generateReport();
        prog.debugCode();
    }
}
