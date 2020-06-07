package examen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class BtnActions {
    private int i;
    private int k = 2;
    private String index = "";

    public BtnActions(ActionEvent e, JTextField t, JPanel p, JFrame f) {
        generate_button(e, t, p,  f);
    }

    private void generate_button (ActionEvent e, JTextField t, JPanel p, JFrame jframe) {
        jframe.setSize(500, 228);
        jframe.setLocationRelativeTo(null);

        String t_text = t.getText();
        int t_nbr = t_text.length();

        ArrayList<String> t_list = new ArrayList<String>();
        for (i = 0; i <= t_nbr -1; i++) {
            t_list.add(t_text.substring(i, i + 1));
            System.out.println(t_text.substring(i, i + 1));
        }

        jframe.setLocationRelativeTo(null);

        JButton[] button_generate = new JButton[t_nbr];
        for (i = 0; i <= t_nbr -1; i++) {

            button_generate[i] = new JButton(t_list.get(i));
            // button_generate[i] = new JButton(t_list.get(i) + " " + Integer.toString(i));
            p.add(button_generate[i]);

            button_generate[i].addActionListener(
                    new ActionListener() {
                        private int myIndex;
                        {this.myIndex = i;}

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String newIndex = String.valueOf(myIndex);
                            index = index + newIndex;
                            System.out.println("index is: " + index);

                        }
                    }
            );
        }

    }
}
