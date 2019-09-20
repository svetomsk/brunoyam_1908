package network;

import java.util.NoSuchElementException;

public class InputThread extends Thread {
    private ConnectionHandler handler;

    public InputThread(ConnectionHandler handler) {
        this.handler = handler;
    }

    @Override
    public void run() {
        while(true) {
            try {
                String input = handler.readLine();
                System.out.println(input);
                if (input.equals("exit")) {
                    break;
                }
            }catch (NoSuchElementException exc) {
                System.out.println("Socket closed");
                break;
            }
        }
    }
}
