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
public class Ex05_fen09 extends JFrame implements MouseListener {

  // ----------------------------------------------------------------
  public static void main(String[] args) {
    new Ex05_fen09();
  }

  // ----------------------------------------------------------------
  public Ex05_fen09() {
    initialize();
    setVisible(true);
  }

  // ----------------------------------------------------------------
  private final JPanel panContent = (JPanel) getContentPane();

  private final JButton btnMoins = new JButton("-");
  private final JButton btnPlus = new JButton("+");
  private final JTextField txtNombre = new JTextField("0", 10);
  private final JButton btnReset = new JButton("Reset");

  private int nombre = 0;

  // ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("fen09");
    setBounds(500, 500, 280, 100);
    setLayout(new FlowLayout());

    txtNombre.setEditable(false);
    panContent.add(txtNombre);

    btnMoins.addMouseListener(this);
    panContent.add(btnMoins);

    btnPlus.addMouseListener(this);
    panContent.add(btnPlus);

    btnReset.addMouseListener(this);
    panContent.add(btnReset);

  }

  // ----------------------------------------------------------------
  @Override
  public void mouseClicked(MouseEvent e) {
    JButton btn = (JButton) e.getSource();
    String cde = btn.getText();

    switch (cde) {
      case "Reset":
        nombre = 0;
        break;
      case "+":
        if (nombre < 10) nombre++;
        break;
      case "-":
        if (nombre > 0) nombre--;
        break;
    }
    txtNombre.setText(Integer.toString(nombre));
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
