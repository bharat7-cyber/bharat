class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    @Override
    double getArea() {
        return length * width;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println("Area of rectangle: " + rect.getArea());
    }
}
