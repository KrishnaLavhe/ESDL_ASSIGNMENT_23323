class Book {

    String title;
    String author;
    int price;

    Book(String t) {
        title = t;
        author = "Unknown";
        price = 0;
    }  
    Book(String t, String a) {
        title = t;
        author = a;
        price = 0;
    }
    Book(String t, String a, int p) {
        title = t;
        author = a;
        price = p;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println(); 
    }
}

public class Assign6_Constructor {
    public static void main(String[] args) {
       
        Book book1 = new Book("Java Basics");
        Book book2 = new Book("OOP in Java", "ABC");
        Book book3 = new Book("Advanced Java", "XYZ", 450);

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
