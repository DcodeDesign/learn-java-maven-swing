package exercices.correctifs.EX_05;

import java.awt.Color;
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
public class Ex05_fen02 extends JFrame implements MouseListener {

  // ----------------------------------------------------------------
  public static void main(String[] args) {
    new Ex05_fen02();
  }

  // ----------------------------------------------------------------
  public Ex05_fen02() {
    initialize();
    setVisible(true);
  }

  // ----------------------------------------------------------------
  private final JPanel panContent = (JPanel) getContentPane();
  private final Color panContentColor = panContent.getBackground();

  private final JButton btnClickMe = new JButton("Cliquez !");

  // ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("fen02");
    setBounds(100, 200, 300, 100);
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
    panContent.setBackground(Color.green);
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    panContent.setBackground(panContentColor);
  }

  @Override
  public void mouseEntered(MouseEvent e) {
  }

  @Override
  public void mouseExited(MouseEvent e) {
  }

}
