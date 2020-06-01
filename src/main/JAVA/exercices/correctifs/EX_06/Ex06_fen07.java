package exercices.correctifs.EX_06;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Dominique
 */
public class Ex06_fen07 extends JFrame implements KeyListener {

  // ----------------------------------------------------------------
  public static void main(String[] args) {
    new Ex06_fen07();
  }

  // ----------------------------------------------------------------
  public Ex06_fen07() {
    initialize();
    setVisible(true);
  }

  // ----------------------------------------------------------------
  private final JPanel panContent = (JPanel) getContentPane();

  private final JTextField txtMessage = new JTextField(25);
  private final JLabel lblDirection = new JLabel();

  // ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("fen07");
    setBounds(500, 250, 300, 100);
    setLayout(new FlowLayout());

    txtMessage.addKeyListener(this);

    panContent.add(txtMessage);
    panContent.add(lblDirection);
  }

  // ----------------------------------------------------------------
  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
    int code = e.getKeyCode();
    switch (code) {
      case KeyEvent.VK_RIGHT:
        lblDirection.setText("Je tourne à droite");
        txtMessage.setText(txtMessage.getText() + "D");
        break;
      case KeyEvent.VK_LEFT:
        lblDirection.setText("Je tourne à gauche");
        txtMessage.setText(txtMessage.getText() + "G");
        break;
      case KeyEvent.VK_UP:
        lblDirection.setText("J'accélère");
        txtMessage.setText(txtMessage.getText() + "A");
        break;
      case KeyEvent.VK_DOWN:
        lblDirection.setText("Je freine");
        txtMessage.setText(txtMessage.getText() + "F");
        break;
      default:
        lblDirection.setText("Que faire ?");
        break;
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }

}
