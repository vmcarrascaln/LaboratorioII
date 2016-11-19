/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoAgate;
import java.util.*;

/**
 *
 * @author victor carrascal
 */
class Clientes {
    private String contactoPrincipal, nombre,direcciones;

    public Clientes(String contactoPrincipal, String nombre, String direcciones) {
        this.contactoPrincipal = contactoPrincipal;
        this.nombre = nombre;
        this.direcciones = direcciones;
    }
    

    public void registroCampaña(Campaña c){
        
    }
    
    public Persona setContactoPrincipal(){
        return null;
    }
    
    public void verificacionPresupuesto(Campaña c){
        
    }
    
    public double incentivoAnual(Persona p){
        return 0;
    }
    
       
    public String getContactoPrincipal() {
        return contactoPrincipal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirecciones() {
        return direcciones;
    }

    public void setContactoPrincipal(String contactoPrincipal) {
        this.contactoPrincipal = contactoPrincipal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirecciones(String direcciones) {
        this.direcciones = direcciones;
    }
}
