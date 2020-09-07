package app.vistaPrincipal;

// import java.awt.Color;

import javax.swing.JFrame;
// import javax.swing.JButton;
// import javax.swing.JLabel;
// import javax.swing.JTextField;

/**
 * @author CrissUD - Cristian Felipe Patiño Cáceres
 */
public class VistaPrincipalTemplate extends JFrame {

  // private JButton bEnviar;
  // private JTextField tNombre;
  // private JLabel lnombre;

  private static final long serialVersionUID = 1L;

  public VistaPrincipalTemplate() {
    super("Vista Principal");
    this.saludar();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(1200, 700);
    setLocationRelativeTo(this);
    setLayout(null);
    // setUndecorated(true);
    // getContentPane().setBackground(Color.WHITE);
    setVisible(true);
  }

  public void saludar() {
    String mensaje = "Hola Mundo";
    System.out.println(mensaje);
  }
}
