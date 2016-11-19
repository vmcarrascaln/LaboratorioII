/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodco;

/**
 *
 * @author victor carrascal
 */
public class Fabrica extends FoodCo{
    private String nombref;

    public Fabrica(Empleados[] empleados, String nombre,String nombref) {
        super(empleados, nombre);
        this.nombref=nombref;
        
    }

    public Empleados[] AsignarLineaEmpleadosSemana(){
        return null;    
    }
}
