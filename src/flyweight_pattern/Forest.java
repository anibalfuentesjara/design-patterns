package flyweight_pattern;

import java.util.ArrayList;
import java.util.List;

public class Forest {

	public List<Tree> trees = new ArrayList<Tree>();

	public Tree plantTree(int x, int y, String name, String color, String texture) {
		Tree tree = TreeFactory.createTree(x, y, name, color, texture);
		trees.add(tree);
		return tree;
	}

	public void draw() {
		for (Tree tree : trees)
			tree.draw();
	}

}
