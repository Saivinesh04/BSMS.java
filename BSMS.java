import java.util.ArrayList;
import java.util.Scanner;

public class BSMS {
    
    static ArrayList<BookD> bookList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static String username = "sai";
    static String password = "vinesh";
    
    public static void main(String[] args) {
		System.out.println("\n\n***********************************************\n");
        System.out.println("Welcome to the Book Store Management System!");
		System.out.println("\n***********************************************\n");
        
		System.out.println("Please enter your login credentials:");
        boolean authenticated = login();
		
        if (authenticated) {
            boolean exit = false;
            while (!exit) {
                System.out.println("\nPlease choose an option:");
                System.out.println("1. Add book");
                System.out.println("2. Remove book");
                System.out.println("3. Display book list");
                System.out.println("4. Exit");
				System.out.print("Please enter your option: ");
                int choice = sc.nextInt();
                
                switch (choice) {
                    case 1:
                        addBook();
                        break;
                    case 2:
                        removeBook();
                        break;
                    case 3:
                        displayBooks();
                        break;
                    case 4:
                        exit = true;
                        System.out.println("Thank you for using the Apna Book Store!");
						System.out.println("I hope You Enjoyed our services ...!");
						System.out.println("Please Visit Again !!!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        } else {
            System.out.println("Login failed. Please try again.");
        }
    }
    
    static boolean login() {
        System.out.print("\nUsername: ");
        String inputUsername = sc.next();
        System.out.print("Password: ");
        String inputPassword = sc.next();
        
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("\nLogin successful!");
            return true;
        } else {
            return false;
        }
    }
    
    static void addBook() {
        System.out.println("\nPlease enter the book details:");
        System.out.print("Title: ");
        String title = sc.next();
        System.out.print("Author: ");
        String author = sc.next();
        System.out.print("Publisher: ");
        String publisher = sc.next();
        System.out.print("ISBN: ");
        String isbn = sc.next();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        
        BookD book = new BookD(title, author, publisher, isbn, price);
        bookList.add(book);
        System.out.println("\nBook added successfully!");
    }
    
    static void removeBook() {
        System.out.print("\nEnter the ISBN of the book to remove: ");
        String isbn = sc.next();
        
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getIsbn().equals(isbn)) {
                bookList.remove(i);
                System.out.println("\nBook removed successfully!");
                return;
            }
        }
        
        System.out.println("\nBook not found. Please check the ISBN and try again.");
    }
    
    static void displayBooks() {
        if (bookList.isEmpty()) {
            System.out.println("\nNo books found.");
        } else {
            System.out.println("\nBook list:");
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println((i+1) + ". " + bookList.get(i));
				System.out.println("--------------------------------------------------------------------");
            }
        }
    }
}