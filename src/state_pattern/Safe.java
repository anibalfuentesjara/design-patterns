package state_pattern;

public class Safe {
	private State state;

	public Safe() {
		this.state = new Open();
		this.state.setSafe(this);
	}

	void setState(State aState) {
		state = aState;
		state.setSafe(this);
	}

	public void open() {
		state.open();
	}

	public void close() {
		state.close();
	}

	public void lock(String code) {
		state.lock(code);
	}

	public void enterCode(String code) {
		state.enterCode(code);
	}

	public boolean isOpen() {
		return state.isOpen();
	}

	public boolean isClosed() {
		return state.isClosed();
	}

	public boolean isLocked() {
		return state.isLocked();
	}

}
