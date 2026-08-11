package string;

public class StringBasic1 {
	public static void main(String[] args) {

		String Str1 = "Telusko";
		String Str2 = "Telusko";

		System.out.println(Str1 == Str2); // true
		System.out.println(Str1.equals(Str2)); // true

		System.out.println("********************");

		String Strr1 = new String("Telusko");
		String Strr2 = new String("Telusko");

		System.out.println(Strr1 == Strr2); // false
		System.out.println(Strr1.equals(Strr2)); // false

		System.out.println("********************");
		String Sttr1 = "Telusko";
		String Sttr2 = "telusko";

		System.out.println(Sttr1 == Sttr2); // false
		System.out.println(Sttr1.equals(Sttr2)); // false
		System.out.println(Sttr1.equalsIgnoreCase(Strr2)); // true

		System.out.println("********************");

		System.out.println("********************");

		System.out.println("********************");

		System.out.println("********************");

		System.out.println("********************");

	}

}
