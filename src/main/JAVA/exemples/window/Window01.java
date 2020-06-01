package exemples.window;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window01 extends JFrame {
    public Window01 () {
        super("01");

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };

        addWindowListener(l);
        setSize(200,100);
        setVisible(true);
    }

    public static void main(String [] args){
        JFrame frame = new Window01();
    }
}
