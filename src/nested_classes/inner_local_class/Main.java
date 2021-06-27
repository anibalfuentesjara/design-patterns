package nested_classes.inner_local_class;

public class Main {

	public static void main(String[] args) {

		// Inner local class
		Tree tree = new Tree();
		Tree.Node node = tree.new Node(10);
		System.out.println(node.compare());
	}

}
