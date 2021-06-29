package state_pattern;

public class Closed extends State {

	@Override
	public void open() {
		this.changeState(new Open());
	}

	@Override
	public void lock(String code) {
		this.changeState(new Locked(code));
	}
	
	@Override
	public boolean isClosed() {
		return true;
	}

}
