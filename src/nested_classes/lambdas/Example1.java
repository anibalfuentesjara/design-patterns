package nested_classes.lambdas;

/**
 * Lambdas are anonymous functions
 * 
 * An anonymous function is an implementation of an interface with ONE abstract
 * method
 */
public class Example1 {

	public static void main(String[] args) {
		boolean boolean1 = true;
		boolean boolean2 = false;

		BooleanOperation and = (b1, b2) -> b1 && b2;

		boolean lambdaResult1 = operate(boolean1, boolean2, and);

		boolean lambdaResult2 = operate(boolean1, boolean2, new BooleanOperation() {
			@Override
			public boolean operation(boolean b1, boolean b2) {
				return b1 && b2;
			}
		});

		boolean lambdaResult3 = operate(boolean1, boolean2, (b1, b2) -> b1 && b2);

		System.out.println(lambdaResult1);
		System.out.println(lambdaResult2);
		System.out.println(lambdaResult3);
	}

	public static boolean operate(boolean b1, boolean b2, BooleanOperation bo) {
		return bo.operation(b1, b2);
	}

}
