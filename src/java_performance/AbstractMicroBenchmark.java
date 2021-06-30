package java_performance;

public abstract class AbstractMicroBenchmark {

	private int nLoops;

	public AbstractMicroBenchmark(int nLoops) {
		this.nLoops = nLoops;
	}

	public void doTest() throws Exception {
		// warm up
		double l = myMethod();
		System.out.println("Iterating "+nLoops+" times");
		long then = System.currentTimeMillis();
		// iterate nLoops times
		for (int i = 0; i < nLoops; i++) {
			l = myMethod();
		}
		long now = System.currentTimeMillis();
		System.out.println("Elapsed time: " + (now - then) + " [ms]");
		System.out.println("Iteration time: " + (now - then) / nLoops + " [ms]");
	}

	public abstract double myMethod() throws Exception;

}
