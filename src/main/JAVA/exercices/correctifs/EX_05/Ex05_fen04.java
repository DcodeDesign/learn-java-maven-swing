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
public class Ex05_fen04 extends JFrame implements MouseListener {

  // ----------------------------------------------------------------
  public static void main(String[] args) {
    new Ex05_fen04();
  }

  // ----------------------------------------------------------------
  public Ex05_fen04() {
    initialize();
    setVisible(true);
  }

  // ----------------------------------------------------------------
  private final JPanel panContent = (JPanel) getContentPane();

  private final JButton btnBouton1 = new JButton("Bouton 1 !");
  private final JButton btnBouton2 = new JButton("Bouton 2 !");

  // ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("fen04");
    setBounds(100, 400, 300, 100);
    setLayout(new FlowLayout());

    btnBouton1.addMouseListener(this);
    btnBouton1.setBackground(Color.green);
    btnBouton1.setOpaque(true);

    btnBouton2.addMouseListener(this);
    btnBouton2.setBackground(Color.green);
    btnBouton2.setOpaque(true);

    panContent.add(btnBouton1);
    panContent.add(btnBouton2);

  }

  // ----------------------------------------------------------------
  @Override
  public void mouseClicked(MouseEvent e) {
  }

  @Override
  public void mousePressed(MouseEvent e) {
  }

  @Override
  public void mouseReleased(MouseEvent e) {
  }

  @Override
  public void mouseEntered(MouseEvent e) {
    JButton btn = (JButton) e.getSource();
    btn.setBackground(Color.red);
  }

  @Override
  public void mouseExited(MouseEvent e) {
    JButton btn = (JButton) e.getSource();
    btn.setBackground(Color.green);
  }

}
