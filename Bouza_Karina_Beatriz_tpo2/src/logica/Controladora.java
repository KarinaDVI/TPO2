
package logica;


import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
/*Instancio una controladora de persistencia nueva y la llamo en cada metodo. 
  Permite crear las tablas en la base*/
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia ();
    
/*Creo metodo nuevo para pasarle los atributos del objeto masco para que 
la controladora de persistencia cree el objeto en la base. 
Como elegí autogeneracion de Id no le paso una Id */    
    
    public void crearMascota(String nombre_perro, String raza_perro, String color, String alergico, String atencion_especial, String nombre_duenio, String celular_duenio, String observaciones) {
        //creo el objeto masco y le paso atributos  
        Mascota masco = new Mascota();
        
        masco.setNombre_perro(nombre_perro);
        masco.setRaza_perro(raza_perro);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atencion_especial);
        masco.setNombre_duenio(nombre_duenio);
        masco.setCelular_duenio(celular_duenio);
        masco.setObservaciones(observaciones);

        controlPersis.crearMascota(masco);
    }
    /*Metodos para crear el objeto en la base llamando a los de la controladora 
    de persistencia
    */
    public void crearMascota(Mascota masco) {
        controlPersis.crearMascota(masco);
    }
    public void eliminarMascota(Mascota masco){
        controlPersis.eliminarMascota(masco);
    }
    public void eliminarMascota(int num_cliente){
        controlPersis.eliminarMascota(num_cliente);
    }
    
    public List<Mascota> obtenerMascota(){
        return controlPersis.obtenerMascotas();
    }
    
    public void modificarMascota(Mascota masco){
        controlPersis.modificarMascota(masco);
    }
    public Mascota buscarMascota(Mascota masco){
        return controlPersis.buscarMascota(masco);
    }
    public Mascota buscarMascota(int num_cliente){
        return controlPersis.buscarMascota(num_cliente);
    }
}
