package nested_classes.inner_static_class;

import nested_classes.inner_static_class.Car.Wheel;

public class Main {

	public static void main(String[] args) {
		// Inner static class
		Wheel wheel = new Car.Wheel(15);
		System.out.println(wheel.getSize());
	}

}
