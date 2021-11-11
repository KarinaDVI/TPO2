package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    //Instancio una JPAController para traer los metodos para la base: 
    
    MascotaJpaController mascoJPA = new MascotaJpaController();

    /*metodo para alta; recibe huesped desde la lógica el objeto masco y se los
    pasa a la JPA para grabarlo en la base*/
    
    public void crearMascota(Mascota masco) {
        try {
            mascoJPA.create(masco);
        } catch (Exception e) {
            System.out.println("No se pudo crear la mascota.");
        }
    }

    //Metodo para baja
    public void eliminarMascota(Mascota masco) {

        try {
            mascoJPA.destroy(masco.getNum_cliente());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //Metodo de eliminacion de mascota
    public void eliminarMascota(int num_cliente) {

        try {
            mascoJPA.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    //Metodo para traer la base de datos.
    
    public List<Mascota> obtenerMascotas(){
    return mascoJPA.findMascotaEntities();
    }
    
    //metodo para actualizar mascota
    public void modificarMascota(Mascota masco) {
        try {
            mascoJPA.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //metodo para buscar una mascota por numero de cliente
    public Mascota buscarMascota(Mascota masco){
        return mascoJPA.findMascota(masco.getNum_cliente());
        
    }
    //metodo para buscar una mascota por Id
    public Mascota buscarMascota(int num_cliente){
        return mascoJPA.findMascota(num_cliente);
        
    }
}
