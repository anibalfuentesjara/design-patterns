package state_pattern;

public class Locked extends State {

	private String code;

	public Locked(String code) {
		this.code = code;
	}

	@Override
	public void enterCode(String code) {
		if (this.code.equals(code)) {
			this.changeState(new Closed());
		} else {
			System.out.println("Invalid code");
		}
	}

	@Override
	public boolean isLocked() {
		return true;
	}

}