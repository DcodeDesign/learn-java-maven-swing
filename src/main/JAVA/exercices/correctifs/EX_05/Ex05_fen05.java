package exercices.correctifs.EX_05;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dominique
 */
public class Ex05_fen05 extends JFrame implements MouseListener {

  // ----------------------------------------------------------------
  public static void main(String[] args) {
    new Ex05_fen05();
  }

  // ----------------------------------------------------------------
  public Ex05_fen05() {
    initialize();
    setVisible(true);
  }

  // ----------------------------------------------------------------
  private final JPanel panContent = (JPanel) getContentPane();

  private final JButton btnClickMe = new JButton("Cliquez !");

  // ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("fen05");
    setBounds(100, 500, 300, 100);
    setLayout(new FlowLayout());

    btnClickMe.addMouseListener(this);

    panContent.add(btnClickMe);

  }

  // ----------------------------------------------------------------
  @Override
  public void mouseClicked(MouseEvent e) {
  }

  @Override
  public void mousePressed(MouseEvent e) {
    int btn = e.getButton();

    switch (btn) {
      case 1:
        btnClickMe.setText("Clic gauche...");
        break;
      case 2:
        btnClickMe.setText("Clic milieu...");
        break;
      case 3:
        btnClickMe.setText("Clic droit...");
        break;
    }
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    btnClickMe.setText("Cliquez !");
  }

  @Override
  public void mouseEntered(MouseEvent e) {
  }

  @Override
  public void mouseExited(MouseEvent e) {
  }

}
