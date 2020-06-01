package exercices.correctifs.EX_07;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dominique
 */
public class Ex07_fen01b extends JFrame {

  // ----------------------------------------------------------------
  public static void main(String[] args) {
    new Ex07_fen01b();
  }

  // ----------------------------------------------------------------
  public Ex07_fen01b() {
    initialize();
    setVisible(true);
  }

  // ----------------------------------------------------------------
  public final int TAILLE = 3;

  private final JPanel panContent = (JPanel) getContentPane();

  private JButton[] tabBtnChiffres = new JButton[TAILLE * TAILLE];

  // ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("fen01b");
    setBounds(100, 100, 200, 200);
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();

    for (int i = 0; i < TAILLE * TAILLE; i++) {
      tabBtnChiffres[i] = new JButton(Integer.toString(i + 1));
      gbc.gridx = i % TAILLE;
      gbc.gridy = i / TAILLE;
      panContent.add(tabBtnChiffres[i], gbc);
    }

    /*
      Si TAILLE vaut 3

      i i-1 i%3 i/3
      0   1   0   0
      1   2   1   0
      2   3   2   0
      3   4   0   1
      4   5   1   1
      5   6   2   1
      6   7   0   2
      7   8   1   2
      8   9   2   2
     */
  }

  // ----------------------------------------------------------------
}
