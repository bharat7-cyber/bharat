class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void buy() {
        System.out.println("You bought: " + name + " for ₹" + price);
    }
}

public class Shopping {
    public static void main(String[] args) {
        Product p = new Product("Headphones", 1500);
        p.buy();
    }
}
