//create a book class with the following attributes:
//bookId
// title
//author
//create a parameterized constructor to initilize these values.
//create a merthod displayInformation() to display the book details.
//in main(),create two Book object using the constructor and display their inform
class Book {
    int bookId;
    String title;
    String author;

    public Book( int bookId ,String title , String author){
        this.bookId = bookid;
        this.title = title;
        this.author = author;

    }
    void displayInformation(){
        System.out.println("BookId"+bookId);
        System.out.println("Title"+title);
        System.out.println("Author"+author);
         }
         }
         public class Book7{
             public static void main(String[]args){
                Book Book1 = new Book(1,"photo","Ram");
                Book1.displayInformation();
                Book Book =new Book(2,"photo","Jack");
                Book2.displayInformation();        


         }
         }