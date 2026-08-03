package in.advance.challenge82;

public class TestArray {
	public static void main(String[] args) {
		ArrayOperation opr = new ArrayOperation(new int[] { 1, 3, 58, 9 });
		ArrayOperation.Statistics statistics = opr.new Statistics();
		System.out.println(statistics.mean());
	}

}
