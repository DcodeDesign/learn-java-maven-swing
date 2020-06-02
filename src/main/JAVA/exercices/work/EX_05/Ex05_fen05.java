package exercices.work.EX_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

/*Ex05_fen05:
  Le texte du bouton indique si l'on clique avec quel bouton de la souris on clique.
  Il revient à son texte d'origine lorsqu'on relâche le bouton.*/
public class Ex05_fen05 extends JFrame implements java.awt.event.MouseListener {

    private JFrame jFrame = new JFrame(getClass().getName());
    private JPanel jpanel = new JPanel();
    private Color jpanelColor = jpanel.getBackground();
    private JButton button01 = new JButton("btn   01");
    private JTextField textFeild = new JTextField("...");

    public Ex05_fen05() {

        jFrame.setSize(300,100);
        setBounds(100, 400, 300, 100);
        setLayout(new FlowLayout());

        jpanel.add(button01);
        button01.setBackground(Color.RED);
        button01.setForeground(Color.BLACK);
        button01.setOpaque(true);
        button01.addMouseListener(this);

        jpanel.add(textFeild);

        jFrame.getContentPane().add(jpanel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame jframe = new Ex05_fen05();
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

        int btnNum = e.getButton();

        switch (btnNum){
            case 2:
                textFeild.setText("Click center");
                break;
            case 3:
                textFeild.setText("Click droite");
                break;
            default:
                textFeild.setText("Click gauche");
                break;
        }

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

