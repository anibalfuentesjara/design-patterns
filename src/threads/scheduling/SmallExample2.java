package threads.scheduling;

/**
 * Example on how to stop a thread
 */
public class SmallExample2 {
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		Thread thread = new Thread(counter);
		thread.start();
		Counter.waitSeconds(3);
		counter.stop();
	}
	
	public static class Counter implements Runnable {
		private int value = 0;
		private boolean shouldRun = true;
		
		public void run() {
			while (shouldRun) {
				System.out.println(value);
				value++;
				waitSeconds(1);
			}
		}
		
		private static void waitSeconds(int seconds) {
			try {
				Thread.sleep(seconds*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.exit(1);
			}
		}
		
		public void stop() {
			shouldRun = false;
		}
		
	}

}
