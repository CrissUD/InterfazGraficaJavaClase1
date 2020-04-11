package app.vistaPrincipal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 *
 * @author Cristian Felipe Patiño Cáceres
 */
public class VistaPrincipalTemplate extends JFrame{
    
    private JButton bEnviar;
    private JTextField tNombre;
    
    public VistaPrincipalTemplate(){
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200,700);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }
}
