package com.system.frame;

import java.util.Random;

public class Thread implements Runnable {
    private ImagePanel imagePanel;
    private Random random = new Random();

    public  void setImagePanel(ImagePanel imagePanel){
        this.imagePanel = imagePanel;
    }
    @Override
    public void run() {
        int index = random.nextInt(3);
        imagePanel.setImgPath(String.valueOf(index)+".png");
        imagePanel.repaint();
    }
}
