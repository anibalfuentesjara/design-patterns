package threads.jeronimo_webserver;

import java.net.Socket;

public interface RequestHandler {
	
	void serve(Socket socket);

}