package java_performance;

public class MicroBenchmarkMain {
	
	public static void main(String[] args) throws Exception {
		FibonacciMicroBenchmark benchmark = new FibonacciMicroBenchmark(30, 37);
		benchmark.doTest();
	}

}