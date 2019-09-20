package network;

import java.io.IOException;
import java.net.Socket;

public class ClientSide {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket connection = new Socket("localhost", 12345);
        ConnectionHandler handler = new ConnectionHandler(connection);
        InputThread inputThread = new InputThread(handler);
        OutputThread outputThread = new OutputThread(handler);
        inputThread.start();
        outputThread.start();
        outputThread.join();
        handler.close();
    }
}
