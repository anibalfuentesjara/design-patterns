package null_pattern;

public class ConcreteCell implements Cell {

	private Object value;
	private Cell next;

	public ConcreteCell(Object o, Cell cell) {
		this.value = o;
		this.next = cell;
	}

	@Override
	public int size() {
		return 1 + next.size();
	}

	@Override
	public boolean includes(Object o) {
		return value.equals(o) || next.includes(o);
	}

	@Override
	public int indexOf(Object o, int currentPosition) {
		return value.equals(o) ? currentPosition : next.indexOf(o, currentPosition + 1);
	}

	@Override
	public void addLast(Object o) {
		if (next.isNull()) {
			next = new ConcreteCell(o, next);
		} else {
			next.addLast(o);
		}
	}

	@Override
	public boolean isNull() {
		return false;
	}

}
