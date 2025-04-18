class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat barks");
    }
}

public class Animal1 {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeSound();
    }
}
