package threads.jeronimo_webserver;

import java.net.Socket;

public class LoggingHandler extends ThreadedHandler {

	public LoggingHandler(Socket socket) {
		super(socket);
	}

	@Override
	public void run() {
		if (socket.isConnected()) {
			this.send("<html>Logging</html>");
		}
	}

}
