package network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket server = new ServerSocket();
        server.setReuseAddress(true);
        server.bind(new InetSocketAddress(12345));
        Socket connection = server.accept();

        ConnectionHandler handler = new ConnectionHandler(connection);
        InputThread inputThread = new InputThread(handler);
        OutputThread outputThread = new OutputThread(handler);
        inputThread.start();
        outputThread.start();
        outputThread.join();
//        String input = handler.readLine();
//        System.out.println("From client: " + input);
//        handler.writeLine(input);
        handler.close();

        server.close();

    }
}
