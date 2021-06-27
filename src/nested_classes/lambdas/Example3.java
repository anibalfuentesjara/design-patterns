package nested_classes.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(20.5));
		items.add(new Item(32.7));
		items.add(new Item(120.5));

		Menu myMenu = new Menu(items);
		System.out.println(myMenu.getPrice());
	}

	public static class Menu {
		private List<Item> items = new ArrayList<Item>();

		public Menu(List<Item> items) {
			this.items = items;
		}

		public double getPrice() {
			// Metodo para sumar todos los elementos de un array
			return items.stream().mapToDouble(item -> item.getPrice()).sum();
		}

		public List<Item> getItems() {
			return items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

	}

	public static class Item {
		private double price;

		public Item(double price) {
			this.price = price;
		}

		public double getPrice() {
			return this.price;
		}
	}

}
