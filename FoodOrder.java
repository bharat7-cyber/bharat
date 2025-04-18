class Food {
    String name;
    double price;

    Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Food: " + name + ", Price: ₹" + price);
    }
}

public class FoodOrder {
    public static void main(String[] args) {
        Food item1 = new Food("Burger", 99.0);
        item1.display();
    }
}
