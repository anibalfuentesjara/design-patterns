package state_pattern;

public abstract class State {

	private Safe safe;

	protected void setSafe(Safe safe) {
		this.safe = safe;
	}

	protected void changeState(State state) {
		safe.setState(state);
	}

	void error() {
		throw new RuntimeException();
	}

	public void open() {
		error();
	}

	public void close() {
		error();
	}

	public void lock(String code) {
		error();
	}

	public void enterCode(String code) {
		error();
	}

	public boolean isOpen() {
		return false;
	}

	public boolean isClosed() {
		return false;
	}

	public boolean isLocked() {
		return false;
	}

}
