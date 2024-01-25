package Task;
// Create a new Java class called "Book" with the following attributes:
// String title
// String author
// int yearPublished
// double price
// Implement a constructor in the Book class that takes four parameters corresponding to the attributes and initializes them.Create a main method in a separate class to test the constructor:
// Instantiate three Book objects with different values using the constructor.
// Print out the details of each book (title, author, yearPublished, and price) using System.out.println().
public class Task11_10 {
    public static void main(String[] args) {
        Book b1 = new Book("THE RUNNING GRAVE", "Robert Galbraith", 2023, 199);
        Book b2 = new Book("THE ARMOR OF LIGHT", "Ken Follett", 2022, 150);
        Book b3 = new Book("FOURTH WING", "Rebecca Yarros", 2023, 99.99);

        System.out.println("Book Details:");
        // System.out.println("Title: "+b1.title+"\nAuthor: "+b1.author+"\nYear:"+b1.yearPublished+"\nPrice: $"+b1.price+"\n");
        // System.out.println("Title: "+b2.title+"\nAuthor: "+b2.author+"\nYear:"+b2.yearPublished+"\nPrice: $"+b2.price+"\n");
        // System.out.println("Title: "+b3.title+"\nAuthor: "+b3.author+"\nYear:"+b3.yearPublished+"\nPrice: $"+b3.price+"\n");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}

class Book{
    String title;
    String author;
    int yearPublished;
    double price;
    public Book(String title,String author,int yearPublished,double price){
        this.title = title;
        this.author= author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    public String toString(){
        return "Title: "+title+"\nAuthor: "+author+"\nYear:"+yearPublished+"\nPrice: $"+price+"\n";
        
    }

}
