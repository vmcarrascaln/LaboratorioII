/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoAgate;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author victor carrascal
 */
public class Creativos {
     
    private ArrayList<String> notas;
    private Persona directorFinanzas, diseñadoresGraficos,fotografos,escritores,editores,tecnicoAudio, bibliotecario;

    public Creativos(ArrayList<String> notas, Persona directorFinanzas, Persona diseñadoresGraficos, Persona fotografos, Persona escritores, Persona editores, Persona tecnicoAudio, Persona bibliotecario) {
        this.notas = notas;
        this.directorFinanzas = directorFinanzas;
        this.diseñadoresGraficos = diseñadoresGraficos;
        this.fotografos = fotografos;
        this.escritores = escritores;
        this.editores = editores;
        this.tecnicoAudio = tecnicoAudio;
        this.bibliotecario = bibliotecario;
    }

    public ArrayList<String> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<String> notas) {
        this.notas = notas;
    }

    public Persona getDirectorFinanzas() {
        return directorFinanzas;
    }

    public void setDirectorFinanzas(Persona directorFinanzas) {
        this.directorFinanzas = directorFinanzas;
    }

    public Persona getDiseñadoresGraficos() {
        return diseñadoresGraficos;
    }

    public void setDiseñadoresGraficos(Persona diseñadoresGraficos) {
        this.diseñadoresGraficos = diseñadoresGraficos;
    }

    public Persona getFotografos() {
        return fotografos;
    }

    public void setFotografos(Persona fotografos) {
        this.fotografos = fotografos;
    }

    public Persona getEscritores() {
        return escritores;
    }

    public void setEscritores(Persona escritores) {
        this.escritores = escritores;
    }

    public Persona getEditores() {
        return editores;
    }

    public void setEditores(Persona editores) {
        this.editores = editores;
    }

    public Persona getTecnicoAudio() {
        return tecnicoAudio;
    }

    public void setTecnicoAudio(Persona tecnicoAudio) {
        this.tecnicoAudio = tecnicoAudio;
    }

    public Persona getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Persona bibliotecario) {
        this.bibliotecario = bibliotecario;
    }
    
}
