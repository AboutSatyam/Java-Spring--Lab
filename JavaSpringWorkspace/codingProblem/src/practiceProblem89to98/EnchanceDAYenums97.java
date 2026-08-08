package practiceProblem89to98;

public class EnchanceDAYenums97 {

	enum Day {
		Monday(true), Tuesday(true), Wednesday(true), Thursday(true), Friday(true), Saturday(false), Sunday(false);

		private final boolean isWeekday;

		private Day(boolean isWeekday) {
			this.isWeekday = isWeekday;
		}

		public String getType() {
			return isWeekday ? "WeekDay" : "WeekEnd";
		}
	}

	public static void main(String[] args) {
		for (Day day : Day.values()) {
			System.out.printf("%s : %s\n", day, day.getType());
		}
	}
}