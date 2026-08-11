package array;

class prem {
	int id;
	String name;
	String course;
}

                         // Array Can Be Any Type.
public class ArrayBasic04 {

	public static void main(String[] args) {

		prem[] p = new prem[3];
		p[0] = new prem();
		p[1] = new prem();
		p[2] = new prem();

		p[0].id = 23;
		p[0].name = "Mohini";
		p[0].course = "Cprogram";

		System.out.println(p[0].id);
		System.out.println(p[0].name);
		System.out.println(p[0].course);
		
	}

}
