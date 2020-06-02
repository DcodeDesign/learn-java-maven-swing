package exercices.correctifs.EX_10;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dominique
 */
public class Ex10_01a extends JFrame implements ActionListener {

  // ----------------------------------------------------------------
  public Ex10_01a() {
    initialize();
    setVisible(true);
  }

  public static void main(String[] args) {
    new Ex10_01a();
  }

  // ----------------------------------------------------------------
  private final int NB_BTN = 10;

  private final JPanel conteneur = (JPanel) getContentPane();
  private final List<JButton> lstBtn = new LinkedList<JButton>();
  private final JButton btnAjBoutons = new JButton("Reset");

// ----------------------------------------------------------------
  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setBounds(100, 100, 500, 400);
    setLayout(new FlowLayout());

    btnAjBoutons.addActionListener(this);
    btnAjBoutons.setActionCommand("AjoutBoutons");

    creationBoutons();

  }

  private void creationBoutons() {
    conteneur.remove(btnAjBoutons);
    for (int i = 1; i <= NB_BTN; i++) {
      JButton btn = new JButton("" + i);
      btn.addActionListener(this);
      btn.setActionCommand("SuppressionBouton");
      lstBtn.add(btn);
      conteneur.add(btn);
    }
    revalidate();
    repaint();
  }

  // ----------------------------------------------------------------
  @Override
  public void actionPerformed(ActionEvent e) {
    String action = e.getActionCommand();

    switch (action) {
      case "SuppressionBouton":
        JButton btn = (JButton) e.getSource();
        lstBtn.remove(btn);
        conteneur.remove(btn);

        if (lstBtn.isEmpty()) {
          conteneur.add(btnAjBoutons);
        }
        break;
      case "AjoutBoutons":
        creationBoutons();
        break;
    }
    revalidate();
    repaint();
  }
}
