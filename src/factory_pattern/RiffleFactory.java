package factory_pattern;

public class RiffleFactory implements ShellFactory {
	
	@Override
	public Shell createShell() {
		return new RiffleShell();
	}

}
