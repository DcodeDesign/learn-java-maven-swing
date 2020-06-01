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
public class Ex07_fen01 extends JFrame {

  // ----------------------------------------------------------------
  public static void main(String[] args) {
    new Ex07_fen01();
  }

  // ----------------------------------------------------------------
  public Ex07_fen01() {
    initialize();
    setVisible(true);
  }

  // ----------------------------------------------------------------
  private final JPanel panContent = (JPanel) getContentPane();

  private JButton[] tabBtnChiffres = new JButton[9];

  // ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("fen01");
    setBounds(100, 100, 200, 200);
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();

    tabBtnChiffres[0] = new JButton("1");
    gbc.gridx = 0;
    gbc.gridy = 0;
    panContent.add(tabBtnChiffres[0], gbc);

    tabBtnChiffres[1] = new JButton("2");
    gbc.gridx = 1;
    gbc.gridy = 0;
    panContent.add(tabBtnChiffres[1], gbc);

    tabBtnChiffres[2] = new JButton("3");
    gbc.gridx = 2;
    gbc.gridy = 0;
    panContent.add(tabBtnChiffres[2], gbc);

    tabBtnChiffres[3] = new JButton("4");
    gbc.gridx = 0;
    gbc.gridy = 1;
    panContent.add(tabBtnChiffres[3], gbc);

    tabBtnChiffres[4] = new JButton("5");
    gbc.gridx = 1;
    gbc.gridy = 1;
    panContent.add(tabBtnChiffres[4], gbc);

    tabBtnChiffres[5] = new JButton("6");
    gbc.gridx = 2;
    gbc.gridy = 1;
    panContent.add(tabBtnChiffres[5], gbc);

    tabBtnChiffres[6] = new JButton("7");
    gbc.gridx = 0;
    gbc.gridy = 2;
    panContent.add(tabBtnChiffres[6], gbc);

    tabBtnChiffres[7] = new JButton("8");
    gbc.gridx = 1;
    gbc.gridy = 2;
    panContent.add(tabBtnChiffres[7], gbc);

    tabBtnChiffres[8] = new JButton("9");
    gbc.gridx = 2;
    gbc.gridy = 2;
    panContent.add(tabBtnChiffres[8], gbc);

  }

  // ----------------------------------------------------------------
}
