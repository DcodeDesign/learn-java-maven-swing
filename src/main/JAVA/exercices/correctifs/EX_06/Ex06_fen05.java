package exercices.correctifs.EX_06;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Dominique
 */
public class Ex06_fen05 extends JFrame implements KeyListener {

  // ----------------------------------------------------------------
  public static void main(String[] args) {
    new Ex06_fen05();
  }

  // ----------------------------------------------------------------
  public Ex06_fen05() {
    initialize();
    setVisible(true);
  }

  // ----------------------------------------------------------------
  private final JPanel panContent = (JPanel) getContentPane();

  private final JLabel lblMajuscules = new JLabel("Majuscules");
  private final JTextField txtMajuscules = new JTextField(20);
  private final JLabel lblChiffres = new JLabel("Chiffres");
  private final JTextField txtChiffres = new JTextField(20);

  // ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("fen05");
    setBounds(100, 650, 300, 150);
    setLayout(new FlowLayout());

    panContent.add(lblMajuscules);

    txtMajuscules.addKeyListener(this);
    panContent.add(txtMajuscules);

    panContent.add(lblChiffres);

    txtChiffres.addKeyListener(this);
    panContent.add(txtChiffres);
  }

  // ----------------------------------------------------------------
  @Override
  public void keyTyped(KeyEvent e) {
    char key = e.getKeyChar();
    Object src = e.getSource();

    if (src == txtMajuscules && !(Character.isUpperCase(key))) e.consume();
    if (src == txtChiffres && !(Character.isDigit(key))) e.consume();
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
    e.consume();
  }

}
