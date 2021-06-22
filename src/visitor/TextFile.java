package visitor;

public class TextFile extends AbstractFile {

	private String content;

	public TextFile(String name, String content) {
		super(name);
		this.content = content;
		this.size = content.length();
	}

	public String getContent() {
		return content;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitTextFile(this);
	}

}
