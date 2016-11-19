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
public abstract class Anuncios1 implements Anuncio{
    private String fotografias;
    private String graficos;

    public Anuncios1(String fotografias, String graficos) {
        this.fotografias = fotografias;
        this.graficos = graficos;
    }

    public String getFotografias() {
        return fotografias;
    }

    public String getGraficos() {
        return graficos;
    }

    public void setFotografias(String fotografias) {
        this.fotografias = fotografias;
    }

    public void setGraficos(String graficos) {
        this.graficos = graficos;
    }
}
    

