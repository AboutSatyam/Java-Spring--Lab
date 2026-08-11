package string;

public class StringBasic2 {

	public static void main(String[] args) {

		String s1 = "Telusko"; // stp
		String s2 = s1.concat("Alien"); // heap beacuse of references variable
		String s3 = s1 + s2; // heap

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(s2 == s3);
		System.out.println(s3 == s1);

		String stu1 = "SVIRAT";
		String stu2 = "SDHONI";
//		                  Pehele S S same hai then Next v d mai difference 18b ka hai

		int res = stu1.compareTo(stu2);
	//	stu1.contains(stu2);
		System.out.println(res);
	}

}
