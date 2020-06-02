package exercices.correctifs.EX_10;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

/**
 *
 * @author Dominique
 */
public class JTextField_Ctrl extends JTextField implements KeyListener {

  //-------------------------------------------------------------------------
  //-------------------------------------------------------------------------
  private final String carAutorises;

  //-------------------------------------------------------------------------
  //-------------------------------------------------------------------------
  public JTextField_Ctrl(String carAutorises) {
    super();
    this.carAutorises = carAutorises;
    initComponent();
  }

  //-------------------------------------------------------------------------
  private void initComponent() {
    this.addKeyListener(this);
  }

  //-------------------------------------------------------------------------
  //-------------------------------------------------------------------------
  @Override
  public void keyTyped(KeyEvent e) {
    char car = e.getKeyChar();
    if (carAutorises.indexOf(car) < 0) {
      e.consume();  // le caractère n'est pas autorisé
    }
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }
  //-------------------------------------------------------------------------
  //-------------------------------------------------------------------------

}
