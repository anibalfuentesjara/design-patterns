package state_pattern;

public class Locked extends State {

	private String code;

	public Locked(Safe safe, String code) {
		super(safe);
		this.code = code;
	}

	@Override
	public void enterCode(String code) {
		if (this.code.equals(code)) {
			this.safe.setState(new Closed(this.safe));
		} else {
			System.out.println("Invalid code");
		}
	}

	@Override
	public boolean isLocked() {
		return true;
	}

}