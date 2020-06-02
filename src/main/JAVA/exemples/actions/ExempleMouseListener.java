package exemples.actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

/*Ex05_fen06:
  Le texte du bouton indique si l'on clique avec quel bouton de la souris on clique.
  Il revient à son texte d'origine lorsqu'on relâche le bouton.*/
public class ExempleMouseListener extends JFrame implements java.awt.event.MouseListener {

    private JFrame jFrame = new JFrame("Ex06_fen02");
    private JPanel jpanel = new JPanel();
    private Color jpanelColor = jpanel.getBackground();
    private JButton button01 = new JButton("btn   01");
    private JTextField textFeild = new JTextField("...");

    public ExempleMouseListener() {

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
        JFrame jframe = new ExempleMouseListener();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

