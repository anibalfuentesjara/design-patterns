package visitor;

public interface Item {
	
	int getSize();
	String getName();
	void accept(Visitor visitor);

}
