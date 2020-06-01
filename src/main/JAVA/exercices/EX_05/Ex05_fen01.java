package exercices.EX_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* Ex05_fen01:
  Le bouton change de couleur chaque fois que l'on clique dessus.
  Vert -> Rouge -> Vert -> Rouge -> ... */
public class Ex05_fen01 extends JFrame implements ActionListener {
    JFrame jFrame = new JFrame("Ex05_fen01");
    JPanel jpanel = new JPanel();
    private JButton button = new JButton("Color");
    private boolean flag = false;

    public Ex05_fen01() {


        jFrame.setSize(200,80);


        jpanel.add(button);
        button.setBackground(Color.GREEN);
        button.setForeground(Color.WHITE);
        button.setOpaque(true);
        button.setBorderPainted(false);
        button.setFocusPainted(false);

        button.addActionListener(this::actionPerformed);

        jFrame.getContentPane().add(jpanel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame jframe = new Ex05_fen01();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!flag){
            button.setBackground(Color.RED);
            flag = true;
        }else{
            button.setBackground(Color.GREEN);
            flag = false;
        }
    }
}
