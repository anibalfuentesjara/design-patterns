package visitor;

public class NumberOfFilesVisitor extends Visitor {
	
	int numberOfFiles = 0;

	@Override
	public void visitBinaryFile(BinaryFile binaryFile) {
		numberOfFiles += 1;
	}

	@Override
	public void visitTextFile(TextFile textFile) {
		numberOfFiles += 1;
	}
	
	public int getResult() {
		return numberOfFiles;
	}

}
