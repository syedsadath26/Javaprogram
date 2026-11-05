class LibraryBook {
    String title;
    String author;
    double price;

    static int bookCount = 0;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }

    static void displayBookCount() {
        System.out.println("Total Books: " + bookCount);
    }

    public static void main(String[] args) {
        LibraryBook b1 =
                new LibraryBook("Java Basics", "James", 350);

        LibraryBook b2 =
                new LibraryBook("Python Basics", "John", 400);

        LibraryBook b3 =
                new LibraryBook("Cyber Security", "David", 500);

        b1.display();
        b2.display();
        b3.display();

        LibraryBook.displayBookCount();
    }
}