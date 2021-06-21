package observer_java9;

public class Example {
	
	public static void main(String args[]) {
		System.out.println("Enter text>");
		
		final EventSource evSrc = new EventSource();
		
		final ResponseHandler respHandler = new ResponseHandler();
		
		evSrc.addObserver(respHandler);
		
		Thread thread = new Thread(evSrc);
		
		thread.start();
	}

}
