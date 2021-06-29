package flyweight_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The flyweight pattern allows the creation of multiple objects sharing the
 * same data, saving system memory
 * 
 * In this example we have a forest with Trees of different names, color and
 * textures, which we store in a "TreeType", thus, we don't have to store this
 * data in each instance of a Tree
 */
public class Main {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("eucalypt");
		names.add("maple");
		names.add("oak");

		List<String> colors = new ArrayList<String>();
		colors.add("black");
		colors.add("dark brown");
		colors.add("light brown");

		List<String> textures = new ArrayList<String>();
		textures.add("soft");
		textures.add("rugous");

		Random randomizer = new Random();

		Forest myForest = new Forest();
		for (int i = 0; i < 100000; i++)
			myForest.plantTree(randomizer.nextInt(10), randomizer.nextInt(10),
					names.get(randomizer.nextInt(names.size())), colors.get(randomizer.nextInt(colors.size())),
					textures.get(randomizer.nextInt(textures.size())));

		List<TreeType> treeTypes = TreeFactory.getTypes();
		for (int i = 0; i < treeTypes.size(); i++) 
			System.out.println(i + " " + treeTypes.get(i).toString());

	}

}
