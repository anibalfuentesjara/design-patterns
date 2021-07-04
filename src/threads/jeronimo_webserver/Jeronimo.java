package threads.jeronimo_webserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Jeronimo {

	private boolean running;
	private final int port = 7879;
	private ServerSocket serverSocket;

	public void start() {
		running = true;
		this.servingLoop();
	}

	public void stop() throws IOException {
		running = false;
		if (serverSocket != null)
			serverSocket.close();
	}

	private void servingLoop() {
		this.initServingSocket();
		System.out.println("Server running in port " + port);
		while (running) {
			try {
				// accepts is a blocking operation
				// it waits for a connection by a client
				Socket socket = serverSocket.accept();
				System.out.println("new connection");
				this.receiveRequest(socket);
			} catch (IOException e) {
				System.err.println(e);
			}
		}
	}

	public void receiveRequest(Socket socket) {
		ThreadedHandler handler = new ThreadedHandler(socket);
		Thread thread = new Thread(handler);
		thread.start();
	}

	private void initServingSocket() {
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			System.err.println("Cannot create the socket. Maybe the port is already in use?");
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		Jeronimo server = new Jeronimo();
		server.start();
	}

}
