class Person {
    String firstName = "John";
    String lastName = "Doe";

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    String jobTitle = "Manager";

    String getEmployeeId() {
        return "EMP123";
    }

    @Override
    String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}

public class Q7 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
    }
}
