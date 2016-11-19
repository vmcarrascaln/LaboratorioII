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
public abstract class Anuncios3 implements Anuncio {
    private Persona actores, alocuciones, musica;

    public Anuncios3(Persona actores, Persona alocuciones, Persona musica) {
        this.actores = actores;
        this.alocuciones = alocuciones;
        this.musica = musica;
    }

    public Persona getActores() {
        return actores;
    }

    public Persona getAlocuciones() {
        return alocuciones;
    }

    public Persona getMusica() {
        return musica;
    }

    public void setActores(Persona actores) {
        this.actores = actores;
    }

    public void setAlocuciones(Persona alocuciones) {
        this.alocuciones = alocuciones;
    }

    public void setMusica(Persona musica) {
        this.musica = musica;
    }
}
