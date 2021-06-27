package null_object;

public interface Cell {
	
	int size();
	boolean includes(Object o);
	int indexOf(Object o, int currentPosition);
	void addLast(Object o);
	boolean isNull();

}
