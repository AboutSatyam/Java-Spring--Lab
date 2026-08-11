package oops;

class mul {

	int mul(int x, int y) {

		return (x * y);
	}

	double mul(int x, int y, double z) {

		return (x * y * z);
	}
//	
//	
//double mul(double n1 , int n2){
//	
//	return(n1*n2);
//}
//
//
//double mul(double n1 , double  n2){
//	
//	return(n1*n2);
//}

}

public class Mrthodmultiply {

	public static void main(String[] args) {

		mul Multi = new mul();

		int res = Multi.mul(4, 44);
		double res1 = Multi.mul(44, 44, 44);

		System.out.println(res);
		System.out.println(res1);

	}

}