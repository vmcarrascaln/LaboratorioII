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
public class Folletos extends Anuncios1 {
    private String copias;

    public Folletos(String copias, String fotografias, String graficos) {
        super(fotografias, graficos);
        this.copias = copias;
    }

    public String getCopias() {
        return copias;
    }

    public void setCopias(String copias) {
        this.copias = copias;
    } 

    @Override
    public int costeReal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
