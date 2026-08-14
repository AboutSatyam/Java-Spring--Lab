package assignment.byTelusko.program6;

import java.util.ArrayList;

public class Library {

	ArrayList<Books> list = new ArrayList<Books>();

	void addBook(Books book) {
		list.add(book);
		System.out.println("Book Added Successfully");
	}

	void displayBooks() {

		for (Books book : list) {
			if (book.available) {
				System.out.println(book.title + " - " + book.author);
			}
		}
	}

	void checkoutBook(String title) {

		for (Books book : list) {

			if (book.title.equalsIgnoreCase(title) && book.available) {
				book.available = false;
				System.out.println("Book Checked Out");
				return;
			}
		}

		System.out.println("Book Not Available");
	}

	void returnBook(String title) {

		for (Books book : list) {

			if (book.title.equalsIgnoreCase(title)) {
				book.available = true;
				System.out.println("Book Returned");
				return;
			}
		}

		System.out.println("Book Not Found");
	}

	public static void main(String[] args) {

		Library library = new Library();

		Books b1 = new Books("Rich Dad Poor Dad", "Robert Kiyosaki");
		Books b2 = new Books("Java", "Telusko");

		library.addBook(b1);
		library.addBook(b2);

		System.out.println("\nAvailable Books:");
		library.displayBooks();

		library.checkoutBook("Java");

		System.out.println("\nAvailable Books:");
		library.displayBooks();

		library.returnBook("Java");

		System.out.println("\nAvailable Books:");
		library.displayBooks();
	}
}