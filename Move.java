class Animal {
    void move() {
        System.out.println("Animal is moving");
    }
}

class Cheetah extends Animal {
    @Override
    void move() {
        System.out.println("Cheetah runs very fast");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Cheetah cheetah = new Cheetah();
        cheetah.move();
    }
}
