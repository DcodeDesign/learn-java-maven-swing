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
public class Ex06_fen04 extends JFrame implements KeyListener {

  // ----------------------------------------------------------------
  public static void main(String[] args) {
    new Ex06_fen04();
  }

  // ----------------------------------------------------------------
  public Ex06_fen04() {
    initialize();
    setVisible(true);
  }

  // ----------------------------------------------------------------
  private final JPanel panContent = (JPanel) getContentPane();

  private final JLabel lblMajuscules = new JLabel("Majuscules");
  private final JTextField txtMajuscules = new JTextField(20);

  // ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("fen04");
    setBounds(100, 500, 300, 100);
    setLayout(new FlowLayout());

    panContent.add(lblMajuscules);

    txtMajuscules.addKeyListener(this);
    panContent.add(txtMajuscules);
  }

  // ----------------------------------------------------------------
  @Override
  public void keyTyped(KeyEvent e) {
    char key = e.getKeyChar();
    if (!(Character.isUpperCase(key))) e.consume();
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
    e.consume();
  }

}
