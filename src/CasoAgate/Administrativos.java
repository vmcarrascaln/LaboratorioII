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
public class Administrativos {
    private Persona directorOficina;
    private Persona subdirector;
    private Persona secretarias;
    private Persona mecanografos;
    private Persona archivadores;

    public Administrativos(Persona directorOficina, Persona subdirector, Persona secretarias, Persona mecanografos, Persona archivadores) {
        this.directorOficina = directorOficina;
        this.subdirector = subdirector;
        this.secretarias = secretarias;
        this.mecanografos = mecanografos;
        this.archivadores = archivadores;
    }

    public Persona getDirectorOficina() {
        return directorOficina;
    }

    public Persona getSubdirector() {
        return subdirector;
    }

    public Persona getSecretarias() {
        return secretarias;
    }

    public Persona getMecanografos() {
        return mecanografos;
    }

    public Persona getArchivadores() {
        return archivadores;
    }

    public void setDirectorOficina(Persona directorOficina) {
        this.directorOficina = directorOficina;
    }

    public void setSubdirector(Persona subdirector) {
        this.subdirector = subdirector;
    }

    public void setSecretarias(Persona secretarias) {
        this.secretarias = secretarias;
    }

    public void setMecanografos(Persona mecanografos) {
        this.mecanografos = mecanografos;
    }

    public void setArchivadores(Persona archivadores) {
        this.archivadores = archivadores;
    }
    
    
    
    
}