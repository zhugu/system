package com.system.ui;

import javax.swing.*;
import java.awt.*;

public class DemoPanel extends JPanel {
    private JList<String> list;
    private JButton jButton;
    private JLabel jLabel;

    public DemoPanel() {
        setBackground(new Color(102, 204, 204));
        String[] s = new String[]{"aaa", "bbb", "ccc", "ddd", "eee"};
        list = new JList<>(s);
        list.setPreferredSize(new Dimension(260,260));
        Style.setNormalFontFont(list);
        add(list);
        jButton = new JButton("点我，点我");
        jLabel = new JLabel("把鼠标放上来");
        Style.setButtonStyle(jButton);
        Style.setLabelStyle(jLabel);
        add(jButton);
        add(jLabel);
        jLabel.addMouseListener(new MyMouseAdapter(jLabel));
        jButton.addActionListener(new MyActionListener(jButton));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("测试窗体");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.add(new DemoPanel());
        frame.setVisible(true);
    }
}
