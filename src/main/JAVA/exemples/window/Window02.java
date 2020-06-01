package exemples.window;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window02 extends JFrame{
    public Window02 () {
        super("02");

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };

        addWindowListener(l);

        ImageIcon img = new ImageIcon("png.png");
        JButton bouton = new JButton("Mon bouton",img);

        JPanel panneau = new JPanel();
        panneau.add(bouton);
        setContentPane(panneau);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame jFrame = new Window02();
    }

}
