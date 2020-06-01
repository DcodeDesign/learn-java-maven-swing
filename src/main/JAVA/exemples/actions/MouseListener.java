package exemples.actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class MouseListener  extends JFrame implements java.awt.event.MouseListener {
    private JButton button = new JButton("Color");
    public MouseListener () {
        JFrame jFrame = new JFrame("Basic");

        jFrame.setSize(200,200);
        JPanel jpanel = new JPanel();

        jpanel.add(button);
        button.setBackground(Color.RED);
        button.setForeground(Color.WHITE);
        button.setOpaque(true);
        button.setBorderPainted(false);
        button.setFocusPainted(false);

        button.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                button.setBackground(Color.GREEN);
                button.setText("mouseClicked");
            }

            public void mousePressed(MouseEvent e) {
                button.setBackground(Color.RED);
                button.setText("mousePressed");
            }

            public void mouseReleased(MouseEvent e) {
                button.setBackground(Color.blue);
                button.setText("mouseReleased");
            }

            public void mouseEntered(MouseEvent e) {
                button.setBackground(Color.gray);
                button.setText("mouseEntered");
            }
            public void mouseExited(MouseEvent e) {
                button.setBackground(Color.orange);
                button.setText("mouseExited");
            }
        });

        //button.addMouseListener(this);

        jFrame.getContentPane().add(jpanel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame jframe = new MouseListener();
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