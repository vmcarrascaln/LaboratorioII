/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoAgate;
import java.io.IOException;

/**
 *
 * @author victor carrascal
 */
public class Carteleras extends Anuncios1{
    private Persona actores;

    public Carteleras(Persona actores, String fotografias, String graficos) {
        super(fotografias, graficos);
        this.actores = actores;
    }

    public Persona getActores() {
        return actores;
    }

    public void setActores(Persona actores) {
        this.actores = actores;
    }

    @Override
    public int costeReal() {
        throw new UnsupportedOperationException(" "); 
    
    }
    
}
