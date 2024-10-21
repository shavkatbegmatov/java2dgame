package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.age = 25;

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.startGameThread();

        {
            int AA = 16;
            {
                int AA = 20;
                System.out.println(AA);
            }
        }

        // System.out.println(AA);

    }
}
