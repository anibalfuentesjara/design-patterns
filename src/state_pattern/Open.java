package state_pattern;

public class Open extends State {

	public Open(Safe safe) {
		super(safe);
	}

	@Override
	public void close() {
		this.safe.setState(new Closed(this.safe));
	}
	
	@Override
	public boolean isOpen() {
		return true;
	}

}
