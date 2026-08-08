package practiceProblem89to95;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnquineChar {

	public static void main(String[] args) {
		Set<Character> uniqune = new HashSet<>();
		Scanner Scan = new Scanner(System.in);

		System.out.println("Please Enter Your String : ");
		String user = Scan.next();
		for (char ch : user.toCharArray()) {
			uniqune.add(ch);
		}
		System.out.printf("Your String Has %d Unquine Character :", uniqune.size());
	}

}
