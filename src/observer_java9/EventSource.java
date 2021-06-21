package observer_java9;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeSupport;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EventSource implements Runnable {

	private PropertyChangeSupport changes;

	public EventSource() {
		changes = new PropertyChangeSupport(this);
	}

	public void addObserver(ResponseHandler resp) {
		changes.addPropertyChangeListener(resp);
	}

	@Override
	public void run() {
		try {
			final InputStreamReader isr = new InputStreamReader(System.in);
			final BufferedReader br = new BufferedReader(isr);
			while (true) {
				String response = br.readLine();
				if (response.equals("quit"))
					return;

				changes.firePropertyChange(new PropertyChangeEvent(this, "entered text", null, response));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
