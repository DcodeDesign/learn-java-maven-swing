package examen;

import javax.swing.*;
import java.awt.*;

public class Launcher extends JFrame  {
    private JFrame jFrame = new JFrame(getClass().getName());
    private JPanel jPanel = new JPanel();

    public Launcher() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        jFrame.setSize(500, 80);
        jPanel.setBackground(Color.LIGHT_GRAY);

        new AppContent(jFrame, jPanel);

        jFrame.getContentPane().add(jPanel);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        JFrame jframe = new Launcher();
    }
}
