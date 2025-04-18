class Book {
    String title;
    boolean isBorrowed;

    Book(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("You borrowed: " + title);
        } else {
            System.out.println("Book already borrowed.");
        }
    }

    void returnBook() {
        isBorrowed = false;
        System.out.println("Returned: " + title);
    }
}

public class Library {
    public static void main(String[] args) {
        Book b = new Book("Java OOP Concepts");
        b.borrow();
        b.borrow();
        b.returnBook();
    }
}
