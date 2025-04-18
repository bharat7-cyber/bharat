class Shape {
    double getArea() {
        return 0;
    }

    double getPerimeter() {
        return 0;
    }
}

class Circle extends Shape {
    double radius = 7;

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Perimeter of Circle: " + circle.getPerimeter());
    }
}
