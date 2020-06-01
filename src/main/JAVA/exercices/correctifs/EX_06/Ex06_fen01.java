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
public class Ex06_fen01 extends JFrame implements KeyListener {

  // ----------------------------------------------------------------
  public static void main(String[] args) {
    new Ex06_fen01();
  }

  // ----------------------------------------------------------------
  public Ex06_fen01() {
    initialize();
    setVisible(true);
  }

  // ----------------------------------------------------------------
  private final JPanel panContent = (JPanel) getContentPane();

  private final JTextField txtMessage = new JTextField(25);
  private final JLabel lblMessage = new JLabel();

  // ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("fen01");
    setBounds(100, 100, 300, 100);
    setLayout(new FlowLayout());

    txtMessage.addKeyListener(this);
    panContent.add(txtMessage);

    panContent.add(lblMessage);
  }

  // ----------------------------------------------------------------
  @Override
  public void keyTyped(KeyEvent e) {
    lblMessage.setText("Une touche UniCode est enfoncée");
  }

  @Override
  public void keyPressed(KeyEvent e) {
    lblMessage.setText("Une touche quelconque est enfoncée");
  }

  @Override
  public void keyReleased(KeyEvent e) {
    lblMessage.setText("La touche est relachée");
  }

}
