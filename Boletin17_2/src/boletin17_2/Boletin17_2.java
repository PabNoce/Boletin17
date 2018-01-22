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
public class Boletin17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Array array = new Array();
        int[] notas = new int[30];
        Alumnos[] alumnos = new Alumnos[30];

        for (int i = 0; i < 30; i++) {
            alumnos[i] = new Alumnos(ThreadLocalRandom.current().nextInt(0, 11));
            notas[i] = alumnos[i].getNota();
        }
        array.aprobados(notas);
        array.notaMedia(notas);
        array.notaAlta(notas);
    }
}
