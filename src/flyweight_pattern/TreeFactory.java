package flyweight_pattern;

import java.util.ArrayList;
import java.util.List;

public class TreeFactory {

	private static List<TreeType> types = new ArrayList<TreeType>();

	public static Tree createTree(int x, int y, String name, String color, String texture) {
		TreeType type = getTreeType(name, color, texture);
		return new Tree(x, y, type);
	}

	private static TreeType getTreeType(String name, String color, String texture) {
		TreeType newType = new TreeType(name, color, texture);
		int index = types.indexOf(newType);
		if (index >= 0)
			return types.get(index);

		types.add(newType);
		return newType;
	}

	public static List<TreeType> getTypes() {
		return types;
	}

}
