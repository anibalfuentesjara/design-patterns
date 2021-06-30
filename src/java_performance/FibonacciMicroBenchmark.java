package java_performance;

public class FibonacciMicroBenchmark extends AbstractMicroBenchmark {

	private int fibonacciIterations;

	public FibonacciMicroBenchmark(int nLoops, int fibonacciIterations) {
		super(nLoops);
		this.fibonacciIterations = fibonacciIterations;
	}

	@Override
	public double myMethod() throws Exception {
		return fibonacci(fibonacciIterations);
	}

	private double fibonacci(int n) throws Exception {
		if (n < 0)
			throw new IllegalArgumentException("n must be greater or equals than 0, actual: " + n);
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		double d = fibonacci(n - 2) + fibonacci(n - 1);
		if (Double.isInfinite(d))
			throw new ArithmeticException("Overflow");
		return d;
	}

}
