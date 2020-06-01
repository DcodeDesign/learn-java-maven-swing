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
public class Ex05_fen01 extends JFrame implements MouseListener {

  // ----------------------------------------------------------------
  public static void main(String[] args) {
    new Ex05_fen01();
  }

  // ----------------------------------------------------------------
  public Ex05_fen01() {
    initialize();
    setVisible(true);
  }

  // ----------------------------------------------------------------
  private final JPanel panContent = (JPanel) getContentPane();

  private final JButton btnClickMe = new JButton("Cliquez !");

  // ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("fen01");
    setBounds(100, 100, 300, 100);
    setLayout(new FlowLayout());

    btnClickMe.addMouseListener(this);
    btnClickMe.setBackground(Color.green);
    btnClickMe.setOpaque(true);

    panContent.add(btnClickMe);

  }

  // ----------------------------------------------------------------
  @Override
  public void mouseClicked(MouseEvent e) {
    if (btnClickMe.getBackground() == Color.red) {
      btnClickMe.setBackground(Color.green);
    } else {
      btnClickMe.setBackground(Color.red);
    }
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
