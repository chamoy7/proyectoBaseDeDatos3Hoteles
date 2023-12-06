/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.proyecto3_hoteles_204050;

/**
 *
 * @author Jesus
 */
public class AgenciaDeViaje extends Usuario{
    public String nombreAgencia;

    public AgenciaDeViaje(String nombreAgencia, String nombre, String direccion, String telefono,String correo) {
        super(nombre, direccion, telefono,correo);
        this.nombreAgencia = nombreAgencia;
    }
    
    public AgenciaDeViaje(){
        
    }

    public AgenciaDeViaje(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
    }

    public String getNombreAgencia() {
        return nombreAgencia;
    }

    public void setNombreAgencia(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
