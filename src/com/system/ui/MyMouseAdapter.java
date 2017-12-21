package com.system.ui;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter {
    private JButton jButton;
    private JLabel jLabel;

    public MyMouseAdapter(JLabel jLabel) {
        this.jLabel = jLabel;
    }
    public MyMouseAdapter(JButton jButton){
        this.jButton = jButton;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       Style.setBoldFontFont(jLabel);
       Style.setLabelStyle(jLabel);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Style.setNormalFontFont(jLabel);
    }
}
