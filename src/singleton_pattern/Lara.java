package singleton_pattern;

public class Lara {
	
	private static Lara uniqueInstance;
	
	private Lara () {}
	
	public static Lara uniqueInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Lara();
		}
		return uniqueInstance;
	}

}
