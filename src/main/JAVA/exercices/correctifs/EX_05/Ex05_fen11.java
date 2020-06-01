package exercices.correctifs.EX_05;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

/**
 *
 * @author Dominique
 */
public class Ex05_fen11 extends JFrame implements MouseListener {

  // ----------------------------------------------------------------
  public static void main(String[] args) {
    new Ex05_fen11();
  }

  // ----------------------------------------------------------------
  public Ex05_fen11() {
    initialize();
    setVisible(true);
  }

  // ----------------------------------------------------------------
  private final JPanel panContent = (JPanel) getContentPane();

  private final JButton btnMoins = new JButton("-");
  private final JButton btnPlus = new JButton("+");
  private final JTextField txtNombre = new JTextField("0", 10);
  private final JButton btnReset = new JButton("Reset");

  private final JProgressBar pbarNombre = new JProgressBar(JProgressBar.HORIZONTAL, 0, 10);

  private int nombre = 0;

  // ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("fen11");
    setBounds(800, 250, 280, 150);
    setLayout(new FlowLayout());

    txtNombre.setEditable(false);
    panContent.add(txtNombre);

    btnMoins.addMouseListener(this);
    panContent.add(btnMoins);

    btnPlus.addMouseListener(this);
    panContent.add(btnPlus);

    btnReset.addMouseListener(this);
    panContent.add(btnReset);

    pbarNombre.setValue(nombre);
    panContent.add(pbarNombre);

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
    pbarNombre.setValue(nombre);
    if (nombre < 5) pbarNombre.setForeground(Color.red);
    else pbarNombre.setForeground(Color.green);

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
