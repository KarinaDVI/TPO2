
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//Mapeado de clase
@Entity
public class Mascota implements Serializable {
//Mapeado de Id y determino que tipo de generacion de Id uso.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int num_cliente;
//Mapeado de atributos
    @Basic
    private String nombre_perro;
    private String raza_perro;
    private String color;
    private String alergico;
    private String atencion_especial;
    private String nombre_duenio;
    private String celular_duenio;
    private String observaciones;

//Contructor de clase vacio
    public Mascota() {
    }
//Contructor de clase con atributos
    public Mascota(int num_cliente, String nombre_perro, String raza_perro, String color, String alergico, String atencion_especial, String nombre_duenio, String celular_duenio, String observaciones) {
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza_perro = raza_perro;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.nombre_duenio = nombre_duenio;
        this.celular_duenio = celular_duenio;
        this.observaciones = observaciones;
    }
//Setters y Getters
    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public String getRaza_perro() {
        return raza_perro;
    }

    public void setRaza_perro(String raza_perro) {
        this.raza_perro = raza_perro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public String getCelular_duenio() {
        return celular_duenio;
    }

    public void setCelular_duenio(String celular_duenio) {
        this.celular_duenio = celular_duenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}