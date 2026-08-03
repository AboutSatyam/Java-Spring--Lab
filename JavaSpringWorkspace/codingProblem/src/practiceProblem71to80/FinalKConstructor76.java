package practiceProblem71to80;

//76. Create an object with final fields and a constructor to initialize them.

public class FinalKConstructor76 { // This IS Immutable Class because Value Is only Be Edited By Constructor Only
									// .. --> Final Hai Baba .....

	final int noOfWheels;
	final String Model;
	final String engineInLtr;

	public FinalKConstructor76(int noOfWheels, String model, String engineInLtr) {
		super();
		this.noOfWheels = noOfWheels;
		Model = model;
		this.engineInLtr = engineInLtr;
	}

	public static void main(String[] args) {

	}

}
