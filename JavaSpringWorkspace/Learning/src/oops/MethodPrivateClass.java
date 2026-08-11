package oops;

class Book {
	private int pageNum;

	void setPageNum(int pgNo) {

		if (pageNum >= 0) {
			pageNum = pgNo;
		} else {
			System.out.println("Why Negative value you enter");
		}
	}

	void disp() {
		System.out.println("Java at page no: " + pageNum);
	}

	int getPageNum() {
		return pageNum;
	}
}

public class MethodPrivateClass {

	public static void main(String[] args) {
		Book book = new Book();
		book.setPageNum(-4);
		System.out.println(book.getPageNum());// -4 s

		book.disp();

	}

}
