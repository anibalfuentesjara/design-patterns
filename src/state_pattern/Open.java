package state_pattern;

public class Open extends State {

	@Override
	public void close() {
		this.changeState(new Closed());
	}
	
	@Override
	public boolean isOpen() {
		return true;
	}

}
