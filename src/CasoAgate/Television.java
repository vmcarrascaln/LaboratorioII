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
public class Television extends Anuncios3{
    private String videos, peliculas;

    public Television(String videos, String peliculas, Persona actores, Persona alocuciones, Persona musica) {
        super(actores, alocuciones, musica);
        this.videos = videos;
        this.peliculas = peliculas;
    }

    public String getVideos() {
        return videos;
    }

    public void setVideos(String videos) {
        this.videos = videos;
    }

    public String getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(String peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public int costeReal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
