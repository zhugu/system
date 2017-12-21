package com.system.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LoginFrame {
    private JPanel mainPanel;
    private ImagePanel imagePanel;
    private ImagePanel contentPanel;
    private JPanel[] jPanels;

    public LoginFrame(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        imagePanel = new ImagePanel(screenSize.width,screenSize.height,"1.png");
        imagePanel.setLayout(new FlowLayout(FlowLayout.CENTER,150,150));
        mainPanel.add(imagePanel);
        contentPanel = new ImagePanel(480,480,"bg.png");
        contentPanel.setOpaque(false);
        JPanel jPanel = new JPanel(new GridLayout(5,1));
        jPanel.setPreferredSize(new Dimension(450,400));
        jPanel.setOpaque(false);
        JLabel closeLabel = new JLabel();
        closeLabel.setIcon(new ImageIcon(LoginFrame.class.getResource("/icon/关闭.png")));
        closeLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        imagePanel.add(closeLabel);
         imagePanel.add(contentPanel);
        jPanels = new JPanel[5];
        for(int i=0;i<jPanels.length;i++){
            jPanels[i] = new JPanel();
            jPanels[i].setLayout(new FlowLayout(FlowLayout.CENTER,30,20));
            jPanels[i].setBackground(null);
            jPanels[i].setOpaque(false);
        }
        JLabel idLabel = new JLabel("账号");
        idLabel.setFont(new Font("仿宋",Font.BOLD,18));
        JLabel passwordLabel = new JLabel("密码");
        passwordLabel.setFont(new Font("仿宋",Font.BOLD,18));
        JTextField idTextField = new JTextField();
        idTextField.setPreferredSize(new Dimension(200,30));
        idTextField.setOpaque(false);
        JTextField passwordTextField = new JPasswordField();
        passwordTextField.setPreferredSize(new Dimension(200,30));
        passwordTextField .setOpaque(false);
        JButton loginButton = new JButton("登录");
        loginButton.setFont(new Font("仿宋",Font.BOLD,18));
        loginButton.setPreferredSize(new Dimension(75,30));
        JLabel mobileLabel = new JLabel("手机验证码登录");
        mobileLabel.setIcon(new ImageIcon(LoginFrame.class.getResource("/icon/手机.png")));
        mobileLabel.setFont(new Font("仿宋",Font.BOLD,18));
        mobileLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new MobileFrame();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });
        jPanels[1].add(idLabel);jPanels[1].add(idTextField);
        jPanels[2].add(passwordLabel);jPanels[2].add(passwordTextField);
        jPanels[3].add(loginButton);
        jPanels[4].add(mobileLabel);
        for(int i = 0;i<jPanels.length;i++){
            jPanel.add(jPanels[i]);
        }
        contentPanel.add(jPanel);

        Thread thread = new Thread();
        thread.setImagePanel(imagePanel);
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.scheduleAtFixedRate(thread,2,2, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        JFrame frame = new JFrame("LoginFrame");
        frame.setContentPane(new LoginFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
    }
}
