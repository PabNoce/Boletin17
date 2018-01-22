/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_2;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author pnocedalopez
 */
public class Array {

    public Array() {
    }

    public void notaMedia(int[] notas) {
        float notaMedia;
        float suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }
        notaMedia = suma / notas.length;
        System.out.println("nota media: " + notaMedia);
    }

    public void notaAlta(int[] notas) {
        int mayor = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= mayor) {
                mayor = notas[i];
            }
        }
        System.out.println("nota mas alta: " + mayor);
    }

    public void aprobados(int[] notas) {
        int aprobados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            }
        }
        System.out.println("aprobados: " + aprobados);
        System.out.println("suspensos: " + (notas.length - aprobados));
    }

    public void imprimirTodo(int[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}
