package practiceProblem51to60;

import java.util.Scanner;

public class MonthSwitch57 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);// ctrl + shift+ O shortcut;;

		System.out.println("Welcome To calender !!");
		System.out.print("Enter The Month : ");
		int month = Scan.nextInt();
		switch (month) {
		case 1:
			System.out.println("Month Is Jan");
			break;
		case 2:
			System.out.println("Month Is Feb");
			break;
		case 3:
			System.out.println("Month Is Mar");
			break;
		case 4:
			System.out.println("Month Is April");
			break;
		case 5:
			System.out.println("Month Is May");
			break;
		case 6:
			System.out.println("Month Is Jun");
			break;
		case 7:
			System.out.println("Month Is Jul");
			break;
		case 8:
			System.out.println("Month Is Aug");
			break;
		case 9:
			System.out.println("Month Is Sep");
			break;
		case 10:
			System.out.println("Month Is Oct");
			break;
		case 11:
			System.out.println("Month Is Nov");
			break;
		case 12:
			System.out.println("Month Is Dec");
			break;
		default:
			System.out.println("Enter a Vaild Month !!F");

		}

	}

}
