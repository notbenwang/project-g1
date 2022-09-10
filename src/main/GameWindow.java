package main;

import javax.swing.*;

public class GameWindow extends JFrame {
    private JFrame jframe;
    public GameWindow(GamePanel gamePanel) {

        jframe = new JFrame();

        int width = 400;
        int height = 400;

        jframe.setSize(width,height);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);


    }
}
