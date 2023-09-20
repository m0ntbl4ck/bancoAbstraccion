
package com.example;

/**
 *
 * @author mont_
 */
public enum LineaServicio {
    VISA("Clasica"),
    MASTERCARD("Gold"),
    AMERICANEXPRESS("Platino");
    
    String tipoDeLineaDeServicio;

    private LineaServicio(String tipoDeLineaDeServicio) {
        this.tipoDeLineaDeServicio = tipoDeLineaDeServicio;
    }

    public String getTipoDeLineaDeServicio() {
        return tipoDeLineaDeServicio;
    }
    
    
}
