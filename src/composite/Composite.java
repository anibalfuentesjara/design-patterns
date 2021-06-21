package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	private List<Component> components = new ArrayList<Component>();

	@Override
	public int getValue() {
		int s = 0;
		for (Component c : components) {
			s += c.getValue();
		}
		return s;
	}

	public void add(Component component) {
		components.add(component);
	}

}
