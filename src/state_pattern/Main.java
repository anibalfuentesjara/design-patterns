package state_pattern;

public class Main {
	
	public static void main(String[] args) {
		Safe safe = new Safe();
		System.out.println("new safe, is open?");
		System.out.println(safe.isOpen());
		
		safe.close();
		System.out.println("close safe, is closed?");
		System.out.println(safe.isClosed());
		
		System.out.println("lock safe, is locked?");
		safe.lock("abc123");
		System.out.println(safe.isLocked());
		
		System.out.println("unlock safe, is locked?");
		safe.enterCode("jajaja");
		System.out.println(safe.isLocked());
		
		System.out.println("unlock safe, is locked?");
		safe.enterCode("abc123");
		System.out.println(safe.isLocked());
		
		safe.open();
		System.out.println("open safe, is open?");
		System.out.println(safe.isOpen());
	}

}
