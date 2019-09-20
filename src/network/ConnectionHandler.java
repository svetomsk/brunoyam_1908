package network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ConnectionHandler {
    private Socket connection;
    private Scanner input;
    private DataOutputStream output;

    public ConnectionHandler(Socket connection) throws IOException {
        this.connection = connection;
        input = new Scanner(connection.getInputStream());
        output = new DataOutputStream(connection.getOutputStream());
    }

    public void writeLine(String value) throws IOException {
        output.writeBytes(value + "\n");
    }

    public String readLine() {
        return input.nextLine();
    }

    public void close() throws IOException {
        connection.close();
    }
}
