package exercices.EX_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

/*Ex05_fen02:
    La couleur du fond passe en Vert tant que l'on maintient le bouton enfoncé.
    La couleur revient à la couleur de base lorsqu'on relâche le bouton.*/
public class Ex05_fen02_01 extends JFrame implements java.awt.event.MouseListener {

    private JFrame jFrame = new JFrame("Ex05_fen02");
    private JPanel jpanel = new JPanel();
    private Color jpanelColor = jpanel.getBackground();
    private JButton button = new JButton("Color");

    public Ex05_fen02_01() {

        jFrame.setSize(200,200);

        jpanel.add(button);
        button.setBackground(Color.RED);
        button.setForeground(Color.WHITE);
        button.setOpaque(true);
        button.setBorderPainted(false);
        button.setFocusPainted(false);

        button.addMouseListener(this);

        jFrame.getContentPane().add(jpanel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame jframe = new Ex05_fen02_01();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        jpanel.setBackground(jpanelColor);
        button.setText("mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        jpanel.setBackground(Color.RED);
        button.setText("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        jpanel.setBackground(Color.blue);
        button.setText("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jpanel.setBackground(Color.gray);
        button.setText("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        jpanel.setBackground(Color.orange);
        button.setText("mouseExited");
    }
}
