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
public class Array {

    public Array() {
    }

    public static int[] generarArray(int n) {
        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        }
        return numeros;

    }

    public static int[] invertir(int[] numeros) {
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - i - 1];
            numeros[numeros.length - i - 1] = temp;
        }
        return numeros;
    }

    public static void imprimir(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
