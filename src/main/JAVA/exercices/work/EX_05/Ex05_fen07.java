package exercices.work.EX_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*Ex05_fen07:
      idem Ex05_fen06 +
      1 bouton "<-" pour effacer la le dernier chiffre entré.
      Attention aux erreurs possibles !*/
public class Ex05_fen07 extends JFrame {

    private JFrame jFrame = new JFrame(getClass().getName());
    private JPanel jpanel = new JPanel();

    private JTextField textFeild = new JTextField(10);
    private JButton DeleteBtn = new JButton("<-");
    private final JButton[] button = new JButton[10];
    private int i = 0;
    String index = "";

    public Ex05_fen07() {

        jFrame.setSize(500, 140);
        setBounds(100, 400, 300, 100);

        for (i = 0; i <= 9; i++) {
            button[i] = new JButton("btn   " + Integer.toString(i));
            jpanel.add(button[i]);

            button[i].addActionListener(
                    new ActionListener() {
                        private int myIndex;

                        {
                            this.myIndex = i;
                        }

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String newIndex = String.valueOf(myIndex);
                            index = index + newIndex;
                            System.out.println("index is: " + index);
                            textFeild.setText(index);
                        }
                    }
            );
        }

        jpanel.add(textFeild);

        jpanel.add(DeleteBtn);
        DeleteBtn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String str  = textFeild.getText();
                        if (str != null && str.length() > 0) {
                            str = str.substring(0, str.length() - 1);
                        }
                        textFeild.setText(str);
                        index = str;
                        System.out.println("index is: " + str);
                    }
                }
        );

        jFrame.getContentPane().add(jpanel);
        jFrame.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    public static void main(String[] args) {
        JFrame jframe = new Ex05_fen07();
    }

}
