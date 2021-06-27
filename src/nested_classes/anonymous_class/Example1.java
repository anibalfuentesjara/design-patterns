package nested_classes.anonymous_class;

/**
 * An anonymous class implements an interface without giving an explicit name
 */
public class Example1 {

	public static void printValue(I i) {
		System.out.println("Value is: " + i.getValue());
	}

	public static void main(String[] args) {
		printValue(new I() { // anonymous class
			@Override
			public int getValue() {
				return 100;
			}
		});
		
		I withValue = new I() {
			@Override
			public int getValue() {
				return 150;
			}
		};
		printValue(withValue);
		
	}

}
