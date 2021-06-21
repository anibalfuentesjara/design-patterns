package observer;

public class Example {
	
	public static void main(String[] args) {
		System.out.println("Enter text > ");
		
		//Create an event source - reads from stdin
		final EventSource evSrc = new EventSource();
		
		//Create an observer
		final ResponseHandler respHandler = new ResponseHandler();
		
		//Subscrive the observer to the event source
		evSrc.addObserver(respHandler);
		
		//starts the event thread
		Thread thread = new Thread(evSrc);
		thread.start();
	}

}
