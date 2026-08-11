package enumAndAnnotation;

enum Week {
	MON, TUE, WED, THUR, FRI, SAT, SUN;
}

public class Enum1 {

	public static void main(String[] args) {

		Week week = Week.MON;
		System.out.println(week);

		int index = Week.WED.ordinal();
		System.out.println(index);

		Week[] weekAr = Week.values();

		System.out.println(
				"*******************************************************************************************************************************************************************************************************************************");

		for (Week w : weekAr) {
			System.out.println(w.ordinal() + ":-" + w);
		}
	}

}
