package threads.jeronimo_webserver;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

public class ThreadedHandler implements RequestHandler, Runnable {

	Socket socket;
	
	public ThreadedHandler(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void serve(Socket aSocket) {
		socket = aSocket;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		if (socket.isConnected()) {
			this.send("<html>Hello world! Now is <i>" + new Date().toString() + "</i></html>");
			System.out.println("Conection finished");
		}
	}

	protected void send(String textToSend) {
		try {
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			writeResponse(out, textToSend);
			out.write(textToSend);
			out.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error when writing");
		}
	}

	private void writeResponse(BufferedWriter out, String message) throws IOException {
		out.write("HTTP/1.0 200 OK\r\n");
		out.write("Date: Fri, 31 Dec 1999 23:59:59 GMT\r\n");
		out.write("Server: Apache/0.8.4\r\n");
		out.write("Content-Type: text/html\r\n");
		out.write("Content-Length: "+message.length()+"\r\n");
		out.write("Expires: Sat, 01 Jan 2000 00:59:59 GMT\r\n");
		out.write("Last-modified: Fri, 09 Aug 1996 14:21:40 GMT\r\n");
		out.write("\r\n");
	}

}
