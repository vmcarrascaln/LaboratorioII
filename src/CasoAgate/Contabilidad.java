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
public class Contabilidad {
    private Persona responsable, controladorFinanzas, contable, asistenteContable;

    public Contabilidad(Persona responsable, Persona controladorFinanzas, Persona contable, Persona asistenteContable) {
        this.responsable = responsable;
        this.controladorFinanzas = controladorFinanzas;
        this.contable = contable;
        this.asistenteContable = asistenteContable;
    }

    public Persona getResponsable() {
        return responsable;
    }

    public Persona getControladorFinanzas() {
        return controladorFinanzas;
    }

    public Persona getContable() {
        return contable;
    }

    public Persona getAsistenteContable() {
        return asistenteContable;
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
    }

    public void setControladorFinanzas(Persona controladorFinanzas) {
        this.controladorFinanzas = controladorFinanzas;
    }

    public void setContable(Persona contable) {
        this.contable = contable;
    }

    public void setAsistenteContable(Persona asistenteContable) {
        this.asistenteContable = asistenteContable;
    }
    
}