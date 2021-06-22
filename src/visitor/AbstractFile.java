package visitor;

public abstract class AbstractFile extends AbstractItem {
	
	protected int size;
	
	public AbstractFile(String aName) {
		super(aName);
	}
	
	@Override
	public int getSize() {
		return size;
	}

}
