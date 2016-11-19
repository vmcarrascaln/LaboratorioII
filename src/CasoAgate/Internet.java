/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoAgate;
import java.util.*;
/**
 *
 * @author victor carrascal
 */
public class Internet extends Anuncios2{
    private String animaciones;

    public Internet(String animaciones, String texto, String graficos, String fotografias) {
        super(texto, graficos, fotografias);
        this.animaciones = animaciones;
    }

    public String getAnimaciones() {
        return animaciones;
    }

    public void setAnimaciones(String animaciones) {
        this.animaciones = animaciones;
    }
    

    @Override
    public int costeReal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
