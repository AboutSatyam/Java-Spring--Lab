package practiceProblem51to60;

public class Book51 {

//	public static void main(String[] args) 
	static int totalNoOfBooks;

	String author;
	String title;
	String isbn;
	boolean isBorrowed;

	static {
		totalNoOfBooks = 0;
	}
	{// Object Init
		totalNoOfBooks++;
	}

	Book51(String isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;

	}

	Book51(String isbn) {
		this(isbn, "Unknown", "Unknown"); // Conductor Chaning
	}

	static int gettotalNoOfBooks() {
		return totalNoOfBooks;

	}

	void borrowed() {
		if (isBorrowed) {
			System.out.println(" Book IS Already Borrowed By Some One Else --> " + this.title);
		} else {
			this.isBorrowed = true;
			System.out.println(" Enjoy The Bookk  " + this.title);
		}
	}

	void returnBook() {
		if (isBorrowed) {
			this.isBorrowed = false; // not compresiure To write this keyword ...
			System.out.println(" Hopefully You Enjoy Alot !!");
		} else {
			System.out.println(" Book is Already In Libraby --> madd!!");
		}

	}

	public static void main(String[] args) {
		Book51 book1 = new Book51("1", "Bhamcharya", "KeliKunj");
		Book51 book2 = new Book51("2", "MissionMan", "Abj Abdul Kalam");
		Book51 book3 = new Book51("3", "Spy Agent", "Ajit Doval");
		Book51 mybook = new Book51("4");
		System.out.println("Total No Of Books in Libarby Are : " + Book51.gettotalNoOfBooks());

		System.out.println(" "); // space

		book1.borrowed();
		book2.borrowed();
		book3.borrowed();

		mybook.borrowed();
		System.out.println(" "); // space
		book2.borrowed();

	}

}
