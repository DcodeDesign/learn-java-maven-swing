package exercices.correctifs.EX_04.BI1_2020_java04_Fen.src.main.java;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Prof_C313
 */
public class Fen01 extends JFrame implements MouseListener{
    public Fen01(){
        initializzzze();
        setVisible(true);
    }
    
    private final JPanel panContent = (JPanel) getContentPane();
    private final JLabel lblNom = new JLabel("Nom : ");
    private final JTextField txtNom = new JTextField();
    private final JButton btnAfficher = new JButton("Afficher");
    private final JLabel lblMessage = new JLabel();
    private final JTextField txtMessage = new JTextField();

    private String nom;
        
    private void initializzzze(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 400);
        panContent.setLayout(null);
        
        lblNom.setBounds(10, 10, 50, 25);
        panContent.add(lblNom);
        
        txtNom.setBounds(70, 10, 100, 25);
        panContent.add(txtNom);
        
        btnAfficher.setBounds(10, 55, 150, 30);
        btnAfficher.addMouseListener(this);
        panContent.add(btnAfficher);
        
        lblMessage.setBounds(10, 125, 200, 25);
        panContent.add(lblMessage);

        txtMessage.setBounds(10, 150, 200, 25);
        txtMessage.setEnabled(false);
        panContent.add(txtMessage);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        nom= txtNom.getText();
        System.out.println("Bonjour " + nom);
        
        lblMessage.setText("Bonjour " + nom);
        txtMessage.setText("Bonjour " + nom);
        
        txtNom.setText(nom.toUpperCase());
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
