package composite;

public class City implements Component {

	private int inhabitant;

	public City(int inhabitant) {
		this.inhabitant = inhabitant;
	}

	@Override
	public int getValue() {
		return this.inhabitant;
	}

}
