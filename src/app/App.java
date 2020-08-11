package app;

import javax.swing.SwingUtilities;

import app.vistaPrincipal.VistaPrincipalTemplate;

/**
 * @author Cristian Felipe Patiño Cáceres
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable runApplication = new Runnable () {
            public void run(){
                VistaPrincipalTemplate vista = new VistaPrincipalTemplate();
                vista.getClass();
            }
        };
        SwingUtilities.invokeLater(runApplication);
    }
    
}
