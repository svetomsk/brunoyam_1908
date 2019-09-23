package gui;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    private static String [][] labels = {
            {"1", "2", "3", "+"},
            {"4", "5", "6", "-"},
            {"7", "8", "9", "*"},
            {"0", ".", "=", "/"}
    };

    public static void main(String[] args) {
        JFrame window = new JFrame("Window title");
        window.setSize(600, 700);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setLayout(new FlowLayout());

        JPanel status = new JPanel();
        status.setPreferredSize(new Dimension(600, 100));
        JTextField input = new JTextField("0");
        input.setPreferredSize(new Dimension(500, 70));
        status.add(input);
//        status.setBackground(Color.BLUE);

        JPanel keys = new JPanel();
        keys.setPreferredSize(new Dimension(550, 550));
        keys.setLayout(new GridLayout(4, 4));
        ActionListener resultCalculator = e -> {
            String inputString = input.getText();
            try {
                int result = calc(inputString);
                input.setText(result + "");
            } catch (ScriptException e1) {
                input.setText("0");
            }
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                String buttonName = labels[i][j];
                JButton currentButton = new JButton(buttonName);
                if(buttonName.equals("=")) {
                    currentButton.addActionListener(resultCalculator);
                } else {



                    ActionListener actionListener = e -> {
                        String inputString = input.getText();
                        if (inputString.equals("0")) {
                            input.setText(currentButton.getText());
                        } else {
                            input.setText(inputString + currentButton.getText());
                        }
                    };



                    currentButton.addActionListener(actionListener);
                }
                keys.add(currentButton);
            }
        }
//        keys.setBackground(Color.RED);

        window.add(status);
        window.add(keys);
        window.setVisible(true);
    }

    public static int calc(String value) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String foo = value;
        int result = (int) engine.eval(foo);
        return result;
    }
}
