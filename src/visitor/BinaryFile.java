package visitor;

public class BinaryFile extends AbstractFile {

	private byte[] content;

	public BinaryFile(String name, byte[] content) {
		super(name);
		this.content = content;
		this.size = content.length;
	}

	public byte[] getContent() {
		return content;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitBinaryFile(this);
	}

}
