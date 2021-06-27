package null_object;

public class LinkList implements ILinkList {
	private Cell first;

	public LinkList() {
		first = new NullCell();
	}

	@Override
	public void addFirst(Object o) {
		first = new ConcreteCell(o, first);
	}

	@Override
	public boolean includes(Object o) {
		return first.includes(o);
	}

	@Override
	public int size() {
		return first.size();
	}

	@Override
	public boolean isEmpty() {
		return first.size() == 0;
	}

	@Override
	public int indexOf(Object o) {
		return first.indexOf(o, 0);
	}

	@Override
	public void addLast(Object o) {
		first.addLast(o);
	}

}
