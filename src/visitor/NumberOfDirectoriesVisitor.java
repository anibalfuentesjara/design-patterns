package visitor;

public class NumberOfDirectoriesVisitor extends Visitor {

	int numberOfDirectories = 0;

	@Override
	public void visitDirectory(Directory directory) {
		numberOfDirectories += 1;
		super.visitDirectory(directory);
	}

	public int getResult() {
		return numberOfDirectories;
	}

}
