class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void showGrade() {
        if (marks >= 90)
            System.out.println(name + " got Grade A");
        else if (marks >= 75)
            System.out.println(name + " got Grade B");
        else
            System.out.println(name + " needs improvement.");
    }
}

public class GradeSystem {
    public static void main(String[] args) {
        Student s = new Student("Rohan", 82);
        s.showGrade();
    }
}
