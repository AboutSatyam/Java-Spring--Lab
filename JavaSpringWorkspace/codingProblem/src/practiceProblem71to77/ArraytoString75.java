package practiceProblem71to77;

//75. Take an array of words and concatenate them into a single string using StringBuilder.
public class ArraytoString75 {

	public static void main(String[] args) {
		String[] arr = new String[] { "hello", "World ", "Satyam" };
		StringBuilder sb = new StringBuilder();
		for (String str : arr) {
			sb.append(str).append(" ");

		}

		System.out.println(sb);
	}

}
