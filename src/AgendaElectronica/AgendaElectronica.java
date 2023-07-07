package AgendaElectronica;

import igu.Principal;

public class AgendaElectronica {

    public static void main(String[] args) {

        // Llamamos interfaz gráfica
        Principal princ = new Principal();
        //La hacemos visible
        princ.setVisible(true);
        //Para que aparezca centrado en la pantalla
        princ.setLocationRelativeTo(null);

    }
    
}
