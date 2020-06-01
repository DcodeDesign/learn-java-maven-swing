package exercices.correctifs.EX_06;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Dominique
 */
public class Ex06_fen03 extends JFrame implements KeyListener {

  // ----------------------------------------------------------------
  public static void main(String[] args) {
    new Ex06_fen03();
  }

  // ----------------------------------------------------------------
  public Ex06_fen03() {
    initialize();
    setVisible(true);
  }

  // ----------------------------------------------------------------
  private final JPanel panContent = (JPanel) getContentPane();

  private final JTextField txtMessage = new JTextField(25);
  private final JLabel lblKeyPressed = new JLabel("texte qd keyPressed");
  private final JTextField txtKeyPressed = new JTextField(20);
  private final JLabel lblKeyTyped = new JLabel("texte qd  keyTyped");
  private final JTextField txtKeyTyped = new JTextField(20);
  private final JLabel lblKeyReleased = new JLabel("texte qd keyReleased");
  private final JTextField txtKeyReleased = new JTextField(20);

  // ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("fen03");
    setBounds(100, 300, 300, 250);
    setLayout(new FlowLayout());

    txtMessage.addKeyListener(this);
    panContent.add(txtMessage);

    txtKeyPressed.setEnabled(false);
    txtKeyTyped.setEnabled(false);
    txtKeyReleased.setEnabled(false);

    panContent.add(lblKeyPressed);
    panContent.add(txtKeyPressed);

    panContent.add(lblKeyTyped);
    panContent.add(txtKeyTyped);

    panContent.add(lblKeyReleased);
    panContent.add(txtKeyReleased);
  }

  // ----------------------------------------------------------------
  @Override
  public void keyTyped(KeyEvent e) {
    txtKeyTyped.setText(txtMessage.getText());
  }

  @Override
  public void keyPressed(KeyEvent e) {
    txtKeyPressed.setText(txtMessage.getText());
  }

  @Override
  public void keyReleased(KeyEvent e) {
    txtKeyReleased.setText(txtMessage.getText());
  }

}
