package visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory extends AbstractItem {
	private List<Item> items = new ArrayList<Item>();

	public Directory(String name) {
		super(name);
	}

	@Override
	public int getSize() {
		int totalSize = 0;
		for (Item item : items)
			totalSize += item.getSize();
		return totalSize;
	}

	public void add(Item item) {
		items.add(item);
	}

	public List<Item> getItems() {
		return items;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitDirectory(this);
	}

}
