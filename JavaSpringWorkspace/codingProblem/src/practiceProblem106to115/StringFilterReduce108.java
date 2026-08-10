package practiceProblem106to115;

import java.util.List;

public class StringFilterReduce108 {

	public static void main(String[] args) {

		List<String> strs = List.of("Satyam Pandey", "Done" ,"Hello World", "Java THEN Spring THEN Devops");
	         String res = strs.stream()
		       .filter(str -> str.length() > 10)
		           .reduce("", (a, b) -> a + " " + b);
	
	          System.out.println(res);
		
	}

}
