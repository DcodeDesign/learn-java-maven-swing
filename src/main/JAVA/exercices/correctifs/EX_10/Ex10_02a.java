package exercices.correctifs.EX_10;

//import controleTexte.*;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Dominique
 */
public class Ex10_02a extends JFrame {

  // ----------------------------------------------------------------
  public Ex10_02a() {
    initialize();
    setVisible(true);
  }

  public static void main(String[] args) {
    new Ex10_02a();
  }

  // ----------------------------------------------------------------
  private final JTextField txtTout = new JTextField();
  private final JTextField_Maj txtMaj = new JTextField_Maj();
  private final JTextField_Chif txtChif = new JTextField_Chif();
  private final JTextField_Ctrl txtCtrl = new JTextField_Ctrl("ABC123-");

  private final JPanel conteneur = (JPanel) getContentPane();
// ----------------------------------------------------------------

  private void initialize() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setBounds(100, 100, 500, 400);
    setLayout(new FlowLayout());

    txtTout.setColumns(20);
    txtMaj.setColumns(20);
    txtChif.setColumns(20);
    txtCtrl.setColumns(20);

    conteneur.add(txtTout);
    conteneur.add(txtMaj);
    conteneur.add(txtChif);
    conteneur.add(txtCtrl);

  }
  // ----------------------------------------------------------------

}
