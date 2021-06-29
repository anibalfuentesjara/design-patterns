package flyweight_pattern;

public class TreeType {

	private String name;
	private String color;
	private String texture;

	public TreeType(String name, String color, String texture) {
		this.name = name;
		this.color = color;
		this.texture = texture;
	}

	public String getName() {
		return this.name;
	}

	public String getColor() {
		return this.color;
	}

	public String getTexture() {
		return this.texture;
	}

	public void draw(int x, int y) {
		System.out.println("tree " + name + " of color " + color + " and texture " + texture + " at position x: " + x
				+ " y: " + y);
	}

	@Override
	public String toString() {
		return "name: " + name + " color: " + color + " texture: " + texture;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof TreeType) {
			TreeType type = (TreeType) o;
			return name.equals(type.getName()) && color.equals(type.getColor()) && texture.equals(type.getTexture());
		}
		return false;
	}

}
