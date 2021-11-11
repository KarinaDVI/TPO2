package logica;

import igu.Principal;


public class Bouza_Karina_Beatriz_tpo2 {

    public static void main(String[] args) {
        
    //Instancio una controladora nueva 
        Controladora control = new Controladora();
        
    /*Conexion del igu con la logica. Le paso el control 
    a la clase de la interfaz*/    
        Principal pantalla = new Principal(control);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
        
    }

}
