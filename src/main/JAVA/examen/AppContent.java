package examen;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class AppContent {

    // JTextField field
    private String field_text = "feild_text";
    private boolean field_editable = true;
    Font field_font = new Font("SansSerif", Font.BOLD, 20);
    private JTextField field = new JTextField(field_text);

    // JButton button
    private String button_text = "button_text";
    private JButton button = new JButton(button_text);

    // JButton button
    private String label_text = "label_text";
    private JLabel jLabel = new JLabel(label_text);

    BtnActions btnActions;
    KeyActions keyActions;

    public AppContent(JFrame jFrame, JPanel jPanel) {

        // JPanel jPanel
        jPanel.setLayout(new FlowLayout());
        jPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        // JTextField field
        field.setEditable(field_editable);
        field.setFont(field_font);
        field.setColumns(18);
        jPanel.add(field);

        // JButton button
        button.setSize(50, 20);
        jPanel.add(button);

        // feild Key Action
        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new BtnActions(e, field, jPanel, jFrame
                        );
                    }
                }
        );

        field.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }
}
