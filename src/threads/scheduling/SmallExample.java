package threads.scheduling;

/**
 * Example on multiple threads running at the same time
 */
public class SmallExample implements Runnable {

	private String info;

	public SmallExample(String info) {
		this.info = info;
	}

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println(info + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] argv) {
		new Thread(new SmallExample("thread1")).start();
		new Thread(new SmallExample("thread2")).start();
		new Thread(new SmallExample("thread3")).start();
	}

}
