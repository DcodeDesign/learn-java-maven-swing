package exercices.work.EX_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

/*Ex05_fen04:
  Idem Ex05_fen03, mais avec 2 boutons.*/
public class Ex05_fen04 extends JFrame implements java.awt.event.MouseListener {

    private JFrame jFrame = new JFrame(getClass().getName());
    private JPanel jpanel = new JPanel();
    private Color jpanelColor = jpanel.getBackground();
    private JButton button01 = new JButton("btn   01");
    private JButton button02 = new JButton("btn   02");

    public Ex05_fen04() {

        jFrame.setSize(300,100);
        setBounds(100, 400, 300, 100);
        setLayout(new FlowLayout());

        jpanel.add(button01);
        button01.setBackground(Color.RED);
        button01.setForeground(Color.BLACK);
        button01.setOpaque(true);
        /*button01.setBorderPainted(false);
        button01.setFocusPainted(false);*/
        button01.addMouseListener(this);

        jpanel.add(button02);
        button02.setBackground(Color.RED);
        button02.setForeground(Color.BLACK);
        button02.setOpaque(true);
        /*button02.setBorderPainted(false);
        button02.setFocusPainted(false);*/
        button02.addMouseListener(this);

        jFrame.getContentPane().add(jpanel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame jframe = new Ex05_fen04();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JButton btn = (JButton) e.getSource();
        btn.setText("mouseClicked");
        btn.setBackground(jpanelColor);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        JButton btn = (JButton) e.getSource();
        btn.setText("mousePressed");
        btn.setBackground(jpanelColor);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        JButton btn = (JButton) e.getSource();
        btn.setText("mouseReleased");
        btn.setBackground(jpanelColor);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JButton btn = (JButton) e.getSource();
        btn.setText("mouseEntered");
        btn.setBackground(Color.RED);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JButton btn = (JButton) e.getSource();
        btn.setText("mouseExited");
        btn.setBackground(jpanelColor);
    }
}
