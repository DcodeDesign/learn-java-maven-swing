package exemples.window;

import javax.swing.*;
import java.awt.*;

public class Window03 extends JFrame {
    public Window03 () {
        JFrame f = new JFrame("03");

        f.setSize(200,200);
        JPanel pannel = new JPanel();

        JLabel jLabel1 =new JLabel("Mon texte dans JLabel 1");
        jLabel1.setBackground(Color.red);
        pannel.add(jLabel1);

        JLabel jLabel2 =new JLabel("Mon texte dans JLabel 2");
        jLabel2.setBackground(Color.red);
        jLabel2.setOpaque(true);
        pannel.add(jLabel2);

        f.getContentPane().add(pannel);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame jFrame = new Window03();
    }
}
