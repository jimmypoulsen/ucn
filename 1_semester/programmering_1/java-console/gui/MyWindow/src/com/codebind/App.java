package com.codebind;

import jdk.jfr.Event;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class App {
    private JFrame frame = new JFrame("App");
    private JPanel panelMain;
    private JButton button_msg;
    private JTextField firstname_input;
    private JLabel firstname_label;

    public App() {
        button_msg.addActionListener(e -> JOptionPane.showMessageDialog(null, firstname_input.getText()));
    }

    public static void main(String[] args) {
        App app = new App();
        app.frame.setMinimumSize(new Dimension(500, 500));
        app.frame.setContentPane(app.panelMain);
        app.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.frame.pack();
        app.frame.setVisible(true);
    }
}
