package examen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CoderButtonAction {
    private int t_nbr = 0;
    private JButton b;
    private ArrayList<ArrayList<String>> biDemArrList = new ArrayList();
    ArrayList<String> characters_t_list = new ArrayList();
    private ArrayList<String> t_list = new ArrayList();
    private ArrayList<String> second_t_list = new ArrayList();
    private Font button_font = new Font("SansSerif", Font.BOLD, 12);
    private JButton[] button_generate;
    private String s = "";
    private String regexLetter = "[A-Z]";
    private String regexSpecial = "[A-Za-z0-9- ]";
    private String regexSpace = "[ ]";

    public CoderButtonAction(ActionEvent e, JTextField t, JPanel p, JPanel p2, JFrame f, JButton button_reset) {
        b = ((JButton) e.getSource());
        coder_action(e, t, p, p2, f, button_reset);
    }

    private void coder_action(ActionEvent e, JTextField t, JPanel p, JPanel p2, JFrame f, JButton button_reset) {
        f.setSize(500, 410);
        f.setLocationRelativeTo(null);

        this.b.setText("Coder");
        t.setEditable(false);

        ArrayList<ArrayList<String>> correlation_table = new ArrayList(matchArrayGenerator(t));
        // System.out.println(test);

        button_generate = new JButton[t_nbr];
        for (int i = 0; i < correlation_table.get(0).size(); i++) {
            // Generation des boutons Lettre
            if(correlation_table.get(0).get(i).matches(regexLetter)){
                button_generate[i] = new JButton(correlation_table.get(1).get(i));
                button_generate[i].setPreferredSize(new Dimension(45, 45));
                button_generate[i].setFont(button_font);
                button_generate[i].setForeground(new Color(85, 85, 85));
                p2.add(button_generate[i]);
                int finalI = i;

                button_generate[i].addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseEntered(MouseEvent e) {
                        for (int k = 0; k < correlation_table.get(0).size(); k++) {
                            if(correlation_table.get(0).get(finalI).equals(correlation_table.get(0).get(k))) {
                                button_generate[k].setBackground(new Color(21, 139, 212));
                                button_generate[k].setText(correlation_table.get(0).get(finalI));
                                button_generate[k].setOpaque(true);
                            }
                        }
                    }

                    public void mouseExited(MouseEvent e) {
                        for (int k = 0; k < correlation_table.get(0).size(); k++) {
                            if(correlation_table.get(0).get(finalI).equals(correlation_table.get(0).get(k))) {
                                button_generate[k].setText(correlation_table.get(1).get(finalI));
                                button_generate[k].setOpaque(false);
                            }
                        }
                    }

                });
            }

            // Generation des boutons de caractère spéciaux
            if(!correlation_table.get(0).get(i).matches(regexSpecial)){
                button_generate[i] = new JButton(correlation_table.get(0).get(i));
                button_generate[i].setPreferredSize(new Dimension(45, 45));
                button_generate[i].setEnabled(false);
                p2.add(button_generate[i]);
            }

            // Generation des boutons espace
            if(correlation_table.get(0).get(i).matches(regexSpace)){
                button_generate[i] = new JButton(correlation_table.get(0).get(i));
                button_generate[i].setPreferredSize(new Dimension(60, 28));
                p2.add(button_generate[i]);
            }
        }

        this.b.setVisible(false);
        button_reset.setVisible(true);
    }

    private ArrayList<ArrayList<String>> matchArrayGenerator(JTextField t) {

        // Récupération du text inséré dans la champs
        String t_text = t.getText();

        // Comptage du nombre de lettre du champs récupéré
        t_nbr = t_text.length();

        // Insertion de chaque caractère dans deux arraylist
        for (int i = 0; i <= t_nbr - 1; i++) {
            t_list.add(t_text.substring(i, i + 1));
            second_t_list.add(t_text.substring(i, i + 1));
        }

        // Insertion uniquement des lettres dans une nouvelle arraylist
        for (int i = 0; i < t_nbr; i++) {
            s = String.valueOf(t_list.get(i));
            if (s.matches(regexLetter)) {
                //characters_t_list.add(t_list.get(i));
                characters_t_list.add(t_list.get(i).toUpperCase());
            }
        }

        // characters_t_list : supprime les lettres en double tout en gardant l'ordre initiale
        Set set = new LinkedHashSet();
        set.addAll(characters_t_list);
        ArrayList<String> clean_temp_t_list = new ArrayList<String>(set);
        clean_temp_t_list.clear();
        clean_temp_t_list.addAll(set);

        // Comparaison second_t_list
        for (int i = 0; i < second_t_list.size(); i++) {
            boolean flag = true;
            int l = 0;
            for (l = 0; l < clean_temp_t_list.size() && flag; l++) {
                s = String.valueOf(t_list.get(i));
                if(second_t_list.get(i).equals(clean_temp_t_list.get(l))) {
                    second_t_list.set(i, String.valueOf(clean_temp_t_list.indexOf(clean_temp_t_list.get(l)) + 1));
                    flag = false;
                }

                if(!s.matches(regexSpecial)) {
                    second_t_list.set(i , "Special");
                    flag = false;
                }

                if(second_t_list.get(i).equals(" ")) {
                    second_t_list.set(i , "Espace");
                    flag = false;
                }
            }
        }

        biDemArrList.add(t_list);
        biDemArrList.add(second_t_list);

        return biDemArrList;
    }
}


