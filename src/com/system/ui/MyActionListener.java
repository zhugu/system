package com.system.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
    private JButton jButton;

    public MyActionListener(JButton jButton) {
        this.jButton = jButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new MyDialog("我的消息框");
    }
}
