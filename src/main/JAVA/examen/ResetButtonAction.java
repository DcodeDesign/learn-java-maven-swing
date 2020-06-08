package examen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetButtonAction {
    public ResetButtonAction (ActionEvent e, JTextField t,  JPanel p, JFrame f, JButton b) {
        reset_button(e, t, p, f, b);
    }

   private void reset_button(ActionEvent e, JTextField t,  JPanel p, JFrame f, JButton b2) {
        JButton b = ((JButton) e.getSource());
        p.removeAll();
        p.repaint();
        t.setEditable(true);
        b.setVisible(false);
        b2.setVisible(true);

    }
}
