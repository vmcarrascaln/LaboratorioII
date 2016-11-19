/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoAgate;

/**
 *
 * @author victor carrascal
 */
public class Informatica {
    private Persona directorInformatica;
    private Persona tecnicoSoporte;

    public Informatica(Persona directorInformatica, Persona tecnicoSoporte) {
        this.directorInformatica = directorInformatica;
        this.tecnicoSoporte = tecnicoSoporte;
    }

    public Persona getDirectorInformatica() {
        return directorInformatica;
    }

    public void setDirectorInformatica(Persona directorInformatica) {
        this.directorInformatica = directorInformatica;
    }

    public Persona getTecnicoSoporte() {
        return tecnicoSoporte;
    }

    public void setTecnicoSoporte(Persona tecnicoSoporte) {
        this.tecnicoSoporte = tecnicoSoporte;
    }
    
}
