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
public class Ex06_fen06 extends JFrame implements KeyListener {

  // ----------------------------------------------------------------
  public static void main(String[] args) {
    new Ex06_fen06();
  }

  // ----------------------------------------------------------------
  public Ex06_fen06() {
    initialize();
    setVisible(true);
  }

  // ----------------------------------------------------------------
  private final JPanel panContent = (JPanel) getContentPane();

  private final JLabel lblConsonnes = new JLabel("Consonnes");
  private final JTextField txtConsonnes = new JTextField(20);

  // ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("fen06");
    setBounds(500, 100, 300, 100);
    setLayout(new FlowLayout());

    panContent.add(lblConsonnes);

    txtConsonnes.addKeyListener(this);
    panContent.add(txtConsonnes);
  }

  // ----------------------------------------------------------------
  @Override
  public void keyTyped(KeyEvent e) {
    String voyelles = "aeiouyáàâäãéèêëíìîïóòôöõúùûüýÿ"
            + "AEIOUYÁÀÄÂÃÉÈËÊÍÌÏÎÓÒÖÔÕÚÙÜÛÝ";
    char key = e.getKeyChar();
    if (voyelles.indexOf(key) >= 0) e.setKeyChar('_');
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
    e.consume();
  }

}
