package exercices.work.EX_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

/*Ex05_fen03:
    La couleur du bouton change lors du survol.
    Il revient à sa couleur initiale lorsqu'on arr^te de le survoler.*/
public class Ex05_fen03 extends JFrame implements java.awt.event.MouseListener {

    private JFrame jFrame = new JFrame(getClass().getName());
    private JPanel jpanel = new JPanel();
    private Color jpanelColor = jpanel.getBackground();
    private JButton button = new JButton("Color");

    public Ex05_fen03() {

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
        JFrame jframe = new Ex05_fen03();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        jpanel.setBackground(jpanelColor);
        button.setText("mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        jpanel.setBackground(jpanelColor);
        button.setText("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        jpanel.setBackground(jpanelColor);
        button.setText("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jpanel.setBackground(Color.RED);
        button.setText("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        jpanel.setBackground(jpanelColor);
        button.setText("mouseExited");
    }
}
