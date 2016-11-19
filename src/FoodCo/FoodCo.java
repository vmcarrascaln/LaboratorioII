package foodco;

import java.util.ArrayList;


//"Prueba DOS"
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author victor carrascal
 */
public class FoodCo {

    private Empleados empleados[];
    private String nombre;
    private Fabrica [] fabrica;
    private ArrayList<Empleados> supervisor;

    public FoodCo(Empleados[] empleados, String nombre) {
        this.empleados = empleados;
        this.nombre = nombre;
        this.fabrica= new Fabrica[3];
        this.supervisor=new ArrayList<Empleados>();
    }
   
    public Empleados[] AsignarEmpleadosFabrica(){
        return null;
    }
    public String RegistroEmpleadosDisponibles(){
        return null;    
    }
    
    public String RegistroEmpleadosNoDisponibles(){
        return null;    
    }
    
    public String RegistroEmpleadosProbablementeDisponibles(){
        return null;    
    }
    
    public String AlmacenarSolicitudesVacaciones(){
        return null;    
    }
    
    public String AlmacenarSolicitudesEnfermedad(){
        return null;    
    }
    
}
