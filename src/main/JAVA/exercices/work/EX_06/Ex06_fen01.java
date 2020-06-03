package exercices.work.EX_06;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/* Ex06_fen01:
  Indique si une touche UniCode (un caractère) est enfoncée (keyTyped)
  Indique si une touche (caractère ou shift, ctrl...) est enfoncée (keyPressed)
  Indique si une touche est relâchée (keyReleased) */
public class Ex06_fen01 extends JFrame  {
    private JFrame jFrame = new JFrame(getClass().getName());
    private JPanel jpanel = new JPanel();

    private String textFeildContent = "";
    private JTextField textFeild = new JTextField(10);
    private JLabel textLabelKeyTyped = new JLabel();
    private JLabel textLabelkeyPressed = new JLabel();
    private JLabel textLabelkeyReleased = new JLabel();

    public Ex06_fen01() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 400, 300, 100);
        setLayout(new FlowLayout());
        jFrame.setSize(300, 250);

        Ex06_fen01_content();

        jFrame.getContentPane().add(jpanel);
        jFrame.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    public void Ex06_fen01_content() {
        jpanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        jpanel.setLayout(new GridLayout(0,1));

        textFeild.setEditable(true);
        textFeild.setText(textFeildContent);
        textFeild.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jpanel.add(textFeild);

        textLabelKeyTyped.setText("KeyTyped :");
        textLabelKeyTyped.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jpanel.add(textLabelKeyTyped);

        textLabelkeyPressed.setText("KeyPressed :");
        textLabelkeyPressed.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jpanel.add(textLabelkeyPressed);

        textLabelkeyReleased.setText("KeyReleased :");
        textLabelkeyReleased.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jpanel.add(textLabelkeyReleased);

        textFeild.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                textLabelKeyTyped.setText("KeyTyped : char= " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                textLabelkeyPressed.setText("KeyPressed : UniCode= " + e.getKeyCode() + ", char= " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                textLabelkeyReleased.setText("KeyReleased : code= " + e.getKeyCode() + ", char= " + e.getKeyChar());
            }
        });

    }

    public static void main(String[] args) {
        JFrame jframe = new Ex06_fen01();
    }
}
