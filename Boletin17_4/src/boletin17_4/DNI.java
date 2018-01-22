/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_4;

/**
 *
 * @author pnocedalopez
 */
public class DNI {

    private float nif;

    public DNI(float nif) {
        this.nif = nif;
    }

    public float getNif() {
        return nif;
    }

    public void setNif(float nif) {
        this.nif = nif;
    }

    public String calcularLetra(float nif, String[] letter) {
        int resto = (int) (nif % 23);
        return letter[resto];

    }
}
