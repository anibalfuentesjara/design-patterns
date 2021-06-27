package nested_classes.inner_static_class;

/**
 * Static nested class
 */
public class Car {

	private String color;
	private int year;

	public Car(String color, int year) {
		super();
		this.color = color;
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static class Wheel {

		private int size;

		public Wheel(int size) {
			super();
			this.size = size;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

	}

}
