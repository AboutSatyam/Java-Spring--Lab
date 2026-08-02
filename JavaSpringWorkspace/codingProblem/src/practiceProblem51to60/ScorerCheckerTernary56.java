package practiceProblem51to60;

import java.util.Scanner;

public class ScorerCheckerTernary56 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);// ctrl + shift+ O shortcut;;

		System.out.println("Welcome To Score Checker");
		System.out.print("Enter The Your : ");
		double mark = Scan.nextDouble();
		
		
		if(mark <= 100) {
		String category = mark > 80 ? "High" : (mark > 50 ? "Modernate" : "Low");

		System.out.println("Your Category Is : " + category);
	
		}
	
	else {
		System.out.println(" Enter the Mark In Between 100 !!");
	}
		
	}
	
}
