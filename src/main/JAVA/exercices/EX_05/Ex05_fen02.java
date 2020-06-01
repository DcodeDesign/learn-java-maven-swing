package exercices.EX_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

/*Ex05_fen02:
    La couleur du fond passe en Vert tant que l'on maintient le bouton enfoncé.
    La couleur revient à la couleur de base lorsqu'on relâche le bouton.*/
public class Ex05_fen02 extends JFrame implements java.awt.event.MouseListener {
    private JFrame jFrame = new JFrame("Ex05_fen02");
    private JPanel jpanel = new JPanel();
    private JButton button = new JButton("Color");

    public Ex05_fen02 () {

        jFrame.setSize(200,200);

        jpanel.add(button);
        button.setBackground(Color.RED);
        button.setForeground(Color.WHITE);
        button.setOpaque(true);
        button.setBorderPainted(false);
        button.setFocusPainted(false);

        jpanel.setBackground(Color.black);

        button.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                //jpanel.setBackground(Color.GREEN);
                button.setText("mouseClicked");
            }

            public void mousePressed(MouseEvent e) {
                jpanel.setBackground(Color.GREEN);
                button.setText("mousePressed");
            }

            public void mouseReleased(MouseEvent e) {
                jpanel.setBackground(Color.BLACK);
                button.setText("mouseReleased");
            }

            public void mouseEntered(MouseEvent e) {
                //jpanel.setBackground(Color.gray);
                button.setText("mouseEntered");
            }
            public void mouseExited(MouseEvent e) {
                //jpanel.setBackground(Color.orange);
                button.setText("mouseExited");
            }
        });

        //button.addMouseListener(this);

        jFrame.getContentPane().add(jpanel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame jframe = new Ex05_fen02();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        button.setBackground(Color.GREEN);
        button.setText("mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        button.setBackground(Color.RED);
        button.setText("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        button.setBackground(Color.blue);
        button.setText("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        button.setBackground(Color.gray);
        button.setText("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        button.setBackground(Color.orange);
        button.setText("mouseExited");
    }
}