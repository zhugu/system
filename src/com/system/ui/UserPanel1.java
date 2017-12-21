package com.system.ui;

import javax.swing.*;

public class UserPanel1 extends JPanel {
    private JLabel nameLabel;
    private JScrollPane scrollPane;


    public UserPanel1(){
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("查看信息");
        frame.setSize(1080, 655);
        frame.setLocationRelativeTo(null);
        frame.add(new UserPanel1());
        frame.setVisible(true);
    }
}
