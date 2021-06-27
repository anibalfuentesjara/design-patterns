package null_object;

public class NullCell implements Cell {

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean includes(Object o) {
		return false;
	}

	@Override
	public int indexOf(Object o, int currentPosition) {
		return -1;
	}

	@Override
	public void addLast(Object o) {
		
	}

	@Override
	public boolean isNull() {
		return true;
	}

}
