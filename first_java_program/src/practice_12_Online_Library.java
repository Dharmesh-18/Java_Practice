// You have to implement a library using Java Class Library
// Methods : addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books and to store the issued books

import java.util.ArrayList;
import java.util.Arrays;

class Library{

    String issuedBook;

    String[] aB = new String[50];
    ArrayList<String> availableBooks = new ArrayList<String>(Arrays.asList(aB));
    String[] iB = new String[50];
    ArrayList<String> issuedBooks = new ArrayList<String>(Arrays.asList(iB));

    public void addBook(String book){
        availableBooks.add(book);
        System.out.println(book + " is added to the library!");
    }

    public String issueBook(String book){
        if(availableBooks.contains(book)){
            issuedBook = book;
            availableBooks.remove(book);
            issuedBooks.add(book);
            System.out.println(book+ " is issued!");
            return issuedBook;
        }
        else {
            System.out.println(book + " is not currently in our library! ");
            return "book unavailable!";
        }
    }

    public void returnBook(String book){
        issuedBooks.remove(book);
        availableBooks.add(book);
        System.out.println("Thank you for returning "+ book);
    }

    public void showAvailableBooks(){
        System.out.print("Available books: ");
        for(String book : availableBooks){
            if(book != null) {
                System.out.print(book + "   ");
            }
        }
        System.out.println("");
    }

    public void showIssuedBooks(){
        System.out.print("Issued books: ");
        for(String book : issuedBooks){
            if(book != null){
                System.out.print(book + "   ");
            }
        }
    }


}


public class practice_12_Online_Library {

    public static void main(String[] args) {

        Library lib = new Library();

//        lib.showAvailableBooks();
        lib.addBook("Golden hearts");
        lib.addBook("Flying Arrow");
        lib.addBook("Rhyming squirrels");

        lib.showAvailableBooks();
        lib.issueBook("Golden hearts");
        lib.showAvailableBooks();
        lib.issueBook("Flying Arrow");
        lib.issueBook("Golden hearts");
        lib.showAvailableBooks();
        lib.issueBook("Flying Arrow");
        lib.issueBook("Faster the better!");
        lib.showAvailableBooks();

        lib.returnBook("Golden hearts");
        lib.showAvailableBooks();
        lib.returnBook("Flying Arrow");
        lib.showIssuedBooks();
        lib.showAvailableBooks();

    }

}
