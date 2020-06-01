package exemples.window;

import javax.swing.*;

public class Basic extends JFrame {
    public Basic() {
        JFrame f = new JFrame("Basic");

        f.setSize(200,200);
        JPanel pannel = new JPanel();

        //...

        f.getContentPane().add(pannel);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame jframe = new Basic();
    }
}
