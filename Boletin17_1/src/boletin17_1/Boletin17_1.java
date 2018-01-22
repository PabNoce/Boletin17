/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_1;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author pnocedalopez
 */
public class Boletin17_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Array array = new Array();
        int[] numeros;
        numeros = Array.generarArray(6);
        Array.imprimir(numeros);
        numeros = Array.invertir(numeros);
        Array.imprimir(numeros);
    }

}
