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
public class Ex06_fen02 extends JFrame implements KeyListener {

  // ----------------------------------------------------------------
  public static void main(String[] args) {
    new Ex06_fen02();
  }

  // ----------------------------------------------------------------
  public Ex06_fen02() {
    initialize();
    setVisible(true);
  }

  // ----------------------------------------------------------------
  private final JPanel panContent = (JPanel) getContentPane();

  private final JTextField txtMessage = new JTextField(25);
  private final JLabel lblKeyCode = new JLabel("Code");
  private final JTextField txtKeyCode = new JTextField(20);

  // ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("fen02");
    setBounds(100, 200, 300, 100);
    setLayout(new FlowLayout());

    txtMessage.addKeyListener(this);
    panContent.add(txtMessage);

    txtKeyCode.setEnabled(false);
    panContent.add(lblKeyCode);
    panContent.add(txtKeyCode);
  }

  // ----------------------------------------------------------------
  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
    int code = e.getExtendedKeyCode();
    char car = e.getKeyChar();
    txtKeyCode.setText(Integer.toString(code) + " -> " + car);
  }

  @Override
  public void keyReleased(KeyEvent e) {
    //lblMessage.setText("La touche est relachée");
  }

}
