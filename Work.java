class Employee {
    void work() {
        System.out.println("Employee working");
    }

    double getSalary() {
        return 50000;
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager working");
    }

    void addEmployee() {
        System.out.println("Employee added");
    }
}

public class Q4 {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: " + hr.getSalary());
        hr.addEmployee();
    }
}
