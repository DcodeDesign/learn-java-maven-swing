package exemples.actions;

import exercices.work.EX_05.Ex05_fen01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class ActListener extends JFrame implements java.awt.event.ActionListener {
    private JButton button = new JButton("Color");
    public ActListener() {
        JFrame jFrame = new JFrame("Basic");

        jFrame.setSize(200,200);
        JPanel jpanel = new JPanel();

        jpanel.add(button);
        button.setBackground(Color.RED);
        button.setForeground(Color.WHITE);
        button.setOpaque(true);
        button.setBorderPainted(false);
        button.setFocusPainted(false);

        /*button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                button.setBackground(Color.YELLOW);
                button.setForeground(Color.BLACK);
                button.setText("OH !");
            }
        });*/
        button.addActionListener(this);


        jFrame.getContentPane().add(jpanel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame jframe = new Ex05_fen01();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setBackground(Color.YELLOW);
        button.setForeground(Color.BLACK);
        button.setText("OH !");
    }
}