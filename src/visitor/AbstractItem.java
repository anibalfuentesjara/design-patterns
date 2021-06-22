package visitor;

public abstract class AbstractItem implements Item {
	private String name;
	
	@Override
	public abstract int getSize();
	
	@Override
	public String getName() {
		return this.name;
	}
	
	public AbstractItem(String aName) {
		this.name = aName;
	}
	
}