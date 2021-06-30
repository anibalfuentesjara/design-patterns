package exceptions;

/**
 * Java Exceptions example
 * 
 * In this example the method foo() throws an error of type Ex1, which is caught
 * in the zork() catch block and the finally block is then executed
 */
public class Example {

	public static void main(String[] args) {
		try {
			zork();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void zork() throws Ex2 {
		System.out.println("zork()");
		try {
			foo();
			bar();
		} catch (Ex1 e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("zork() finally");
		}
	}

	private static void foo() throws Ex1 {
		throw new Ex1("Ex1 exception");
	}

	private static void bar() throws Ex2 {
		throw new Ex2("Ex2 exception");
	}

	static class Ex1 extends Exception {
		private static final long serialVersionUID = 7962049328634009184L;

		public Ex1(String message) {
			super(message);
		}

	}

	static class Ex2 extends Exception {
		private static final long serialVersionUID = -1419622832125353830L;

		public Ex2(String message) {
			super(message);
		}
	}

}
