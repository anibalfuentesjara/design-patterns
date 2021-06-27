package state_pattern;

public abstract class State {

	protected Safe safe;
	
	public State(Safe safe) {
		this.safe = safe;
	}
	
	void error() {
		throw new RuntimeException();
	}

	public void open() {
		this.error();
	}

	public void close() {
		this.error();
	}

	public void lock(String code) {
		this.error();
	}

	public void enterCode(String code) {
		this.error();
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
