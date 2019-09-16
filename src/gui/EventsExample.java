package gui;

import javax.swing.*;
import java.awt.event.*;

public class EventsExample {
    public static void main(String[] args) {
        JFrame window = new JFrame("Window title");
        window.setSize(600, 700);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setLayout(null); // абсолютное позиционирование

        JButton clickMe = new JButton("Click me!");
//        clickMe.setSize(100, 70);
        clickMe.setBounds(0, 0, 100, 70);
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked!");
//                System.out.println(e.getButton());
//                System.out.println(e.getX());
//                System.out.println(e.getY());
//                System.out.println(e.getXOnScreen());
//                System.out.println(e.getYOnScreen());
            }

            @Override
            public void mousePressed(MouseEvent e) {
//                System.out.println("Mouse pressed!");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
//                System.out.println("Mouse released!");

            }

            @Override
            public void mouseEntered(MouseEvent e) {
//                System.out.println("Mouse entered!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
//                System.out.println("Mouse exited!");

            }
        };
        MouseWheelListener mouseWheelListener = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                System.out.println(e.getScrollAmount());
                System.out.println(e.getWheelRotation());
            }
        };
        KeyListener keyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_LEFT) {

                } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {

                } else if(e.getKeyCode() == KeyEvent.VK_F9) {

                }
                System.out.println(e.getKeyCode());
                System.out.println(e.getKeyChar());
                System.out.println(e.getExtendedKeyCode());

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        window.setFocusable(true);
        window.addKeyListener(keyListener);
        clickMe.addMouseListener(mouseListener);
        clickMe.addMouseWheelListener(mouseWheelListener);
        window.add(clickMe);

        window.setVisible(true);
    }
}
