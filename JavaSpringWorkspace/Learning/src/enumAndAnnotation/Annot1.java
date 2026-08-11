package enumAndAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface HelloFinal {
	String finfal() default  " hello" ; // single value annotation

}

@interface HelloFinal1 {

	int value();

	String finfal(); // Multi value annotation

}

@HelloFinal1(finfal = "India", value = 34)

public class Annot1 {
	@HelloFinal(finfal = "Done")
	public static void main(String[] args) {

		System.out.println("Hello World");

	}

}
