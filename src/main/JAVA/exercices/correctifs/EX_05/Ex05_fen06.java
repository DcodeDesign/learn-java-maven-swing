package exercices.correctifs.EX_05;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Dominique
 */
public class Ex05_fen06 extends JFrame implements MouseListener {

  // ----------------------------------------------------------------
  public static void main(String[] args) {
    new Ex05_fen06();
  }

  // ----------------------------------------------------------------
  public Ex05_fen06() {
    initialize();
    setVisible(true);
  }

  // ----------------------------------------------------------------
  private final JPanel panContent = (JPanel) getContentPane();

  private final JButton[] tabBtnChiffres = new JButton[10];
  private final JTextField txtNombre = new JTextField(10);
  private final JButton btnEffacer = new JButton("Effacer");

  // ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("fen06");
    setBounds(500, 100, 280, 150);
    setLayout(new FlowLayout());

    for (int i = 0; i < 10; i++) {
      tabBtnChiffres[i] = new JButton(Integer.toString(i));
      tabBtnChiffres[i].addMouseListener(this);
      panContent.add(tabBtnChiffres[i]);
    }

    txtNombre.setEditable(false);
    panContent.add(txtNombre);

    btnEffacer.addMouseListener(this);
    panContent.add(btnEffacer);

  }

  // ----------------------------------------------------------------
  @Override
  public void mouseClicked(MouseEvent e) {
    JButton btn = (JButton) e.getSource();
    String cde = btn.getText();

    if (cde == "Effacer") txtNombre.setText("");
    else txtNombre.setText(txtNombre.getText() + cde);
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
