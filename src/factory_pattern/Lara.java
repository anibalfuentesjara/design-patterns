package factory_pattern;

public class Lara {

	private ShellFactory shellFactory;

	public Shell fire() {
		return shellFactory.createShell();
	}

	public void shellFactory(ShellFactory aShellFactory) {
		shellFactory = aShellFactory;
	}

}
