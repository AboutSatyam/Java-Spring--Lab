package practiceProblem89to98;

public class WeekEnums96 {

	enum Day {
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
	}

	public static void main(String[] args) {
		System.out.println("Here IS Your All The Days In A Week ");

		System.out.println(Day.Monday +" With Sysout");
		for (Day day : Day.values()) {
			System.out.println(day);
		}

	}

}
