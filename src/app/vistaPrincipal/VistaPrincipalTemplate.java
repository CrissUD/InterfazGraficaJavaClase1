package app.vistaPrincipal;

import javax.swing.JFrame;
/**
 *
 * @author Cristian Felipe Patiño Caceres
 */
public class VistaPrincipalTemplate extends JFrame{
    private VistaPrincipalComponent vistaPrincipalComponente;
    
    public VistaPrincipalTemplate(VistaPrincipalComponent vistaPrincipalComponente){
        this.vistaPrincipalComponente = vistaPrincipalComponente;
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200,700);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }
}
