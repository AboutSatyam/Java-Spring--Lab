package practiceProblem71to80;

//73. Simulate a dice roll using Math.random() and display the outcome (1 to 6).

public class DiceMathio73 {

	public int roll() {
		double random = Math.random() * 6; // random only give 0 to 1 that why *6
		return (int) Math.ceil(random); // ceiling -->Roll Uper 
	}

	public static void main(String[] args) {
		DiceMathio73 dice=new DiceMathio73();
		for(int i = 0; i<10;i++) {
			System.out.println(dice.roll());
		}
	}

}
