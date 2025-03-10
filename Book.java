public class Book {
    // Fields
    private String title;
    private String author;
    private double price;

    // Constructor to initialize fields
    Book(String title, String author, double price){
        this.author = author;
        this.price = price;
        this.title = title;
    }

    // Method to display book details
    public void displayDetails(){
        System.out.println("Book title: " + this.title);
        System.out.println("Book author: " + this.author);
        System.out.printf("Book price: %.2f\n", this.price);
    }
}
/*
Book book = new Book("Harry Potter", "J. K. Rowling", 2300);
book.displayDetails();

Book title: Harry Potter
Book author: J. K. Rowling
Book price: 2300.00
 */
