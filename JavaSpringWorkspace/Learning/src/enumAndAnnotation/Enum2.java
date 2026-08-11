package enumAndAnnotation;

enum Result {
	PASS, FAIL, NR;

	int marks;

	Result() {
		System.out.println("Constructor of Enum");
	}

	public void setmarks(int marks) {
		this.marks = marks;
	}

	public int getmarks() {

		return marks;
	}

}

public class Enum2 {

	public static void main(String[] args) {
		Result result = Result.PASS;
		result.setmarks(97);
		System.out.println(result.getmarks());

	}

}
