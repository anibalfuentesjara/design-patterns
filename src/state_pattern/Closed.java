package state_pattern;

public class Closed extends State {

	public Closed(Safe safe) {
		super(safe);
	}

	@Override
	public void open() {
		this.safe.setState(new Open(this.safe));
	}

	@Override
	public void lock(String code) {
		this.safe.setState(new Locked(this.safe, code));
	}
	
	@Override
	public boolean isClosed() {
		return true;
	}

}
