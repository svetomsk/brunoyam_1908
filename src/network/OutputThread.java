package network;

import java.io.IOException;
import java.util.Scanner;

public class OutputThread extends Thread {
    private ConnectionHandler handler;

    public OutputThread(ConnectionHandler handler) {
        this.handler = handler;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String output = sc.nextLine();
            try {
                handler.writeLine(output);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(output.equals("exit")) {
                break;
            }
        }
    }
}
