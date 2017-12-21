package com.system.frame;

import javax.swing.*;

public class MobileFrame extends JFrame{
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton getButton;
    private JButton 立即登录Button;


    public static void main(String[] args) {
        JFrame frame = new JFrame("MobileFrame");
        frame.setContentPane(new MobileFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
