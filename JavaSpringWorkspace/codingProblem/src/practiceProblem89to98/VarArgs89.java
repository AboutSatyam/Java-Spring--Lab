package practiceProblem89to98;

public class VarArgs89 {

	public static void main(String[] args) {
		System.out.println(concatenate("Satyam"));
		System.out.println(concatenate("Amresh", "Kumar"));
		System.out.println(concatenate("Pandey"));
	}

	public static String concatenate(String... strs)
	/**
	 * "This method can receive any number of String arguments Inside the method,
	 * strs behaves like a String array
	 **/

	{
		StringBuilder sb = new StringBuilder();
		for (String str : strs) {
			sb.append(str).append(" ");
		}
		return sb.toString();

	}

}
