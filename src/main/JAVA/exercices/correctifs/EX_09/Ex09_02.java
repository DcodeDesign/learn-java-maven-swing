
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dominique
 */
public class Ex09_02 extends JFrame implements ActionListener {

  // ----------------------------------------------------------------
  public Ex09_02() {
    initialize();
    setVisible(true);
    repaint();
  }

  public static void main(String[] args) {
    new Ex09_02();
  }

  // ----------------------------------------------------------------
  private final int nbBoutons = 100;
  private final ArrayList<JButton> lstButton = new ArrayList<JButton>();
  private final JPanel conteneur = (JPanel) getContentPane();
// ----------------------------------------------------------------

  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setBounds(100, 100, 500, 400);
    setLayout(new FlowLayout());

    for (int i = 1; i <= nbBoutons; i++) {
      JButton btn = new JButton("" + i);
      lstButton.add(btn);
      btn.addActionListener(this);
      //btn.setActionCommand("Click");
      conteneur.add(btn);
    }

  }

  // ----------------------------------------------------------------
  @Override
  public void actionPerformed(ActionEvent e) {
    JButton source = (JButton) e.getSource();

    source.setBackground(Color.red);
    System.out.println("test" + source.getText());
  }
}
