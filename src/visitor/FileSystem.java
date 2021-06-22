package visitor;

public class FileSystem {

	Directory root;

	public FileSystem() {
		this.root = new Directory("root");
	}

	public void add(Item item) {
		root.add(item);
	}

	public Object getSize() {
		return root.getSize();
	}

	public int getNumberOfFiles() {
		NumberOfFilesVisitor v = new NumberOfFilesVisitor();
		root.accept(v);
		return v.getResult();
	}

	public int getNumberOfDirectories() {
		NumberOfDirectoriesVisitor v = new NumberOfDirectoriesVisitor();
		root.accept(v);
		return v.getResult();
	}

	public String listing() {
		ListingVisitor v = new ListingVisitor();
		root.accept(v);
		return v.getResult();
	}

}
