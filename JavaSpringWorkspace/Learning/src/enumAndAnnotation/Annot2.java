package enumAndAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.ANNOTATION_TYPE, ElementType.PARAMETER, ElementType.RECORD_COMPONENT })
@interface HelloFinnal {
	String finfal() default " hello"; // single value annotation

}

public class Annot2 {

	public static void main(String[] args) {

	}

}
