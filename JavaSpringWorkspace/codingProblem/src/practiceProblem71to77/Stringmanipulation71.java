package practiceProblem71to77;

//71. Concatenate and Convert: Take two strings, concatenate them, and convert the result to uppercase.		 

public class Stringmanipulation71 {

	public static void main(String[] args) {

		String name = "Satyam";
		String surname = "Pandey";
		String str1 = name.concat(" ").concat(surname);
		System.out.println(str1.toUpperCase());

	}

}
