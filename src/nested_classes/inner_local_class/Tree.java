package nested_classes.inner_local_class;

/**
 * inner local class
 */
public class Tree {

	private Node root;
	private int maxValue = 100;

	/**
	 * class Node has access to maxValue and has to be constructed from an instance
	 * of Tree
	 */
	class Node {
		private int value;
		private Node left, right;

		Node(int value) {
			this.value = value;
		}

		boolean compare() {
			return value >= maxValue;
		}
	}

}
