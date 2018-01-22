/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_3;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author pnocedalopez
 */
public class Boletin17_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Array array = new Array();
        int[] notas = new int[5];
        String[] nomes = new String[5];
        Alumnos[] alumnos = new Alumnos[5];
        alumnos[0] = new Alumnos(ThreadLocalRandom.current().nextInt(0, 11), "Jose");
        alumnos[1] = new Alumnos(ThreadLocalRandom.current().nextInt(0, 11), "Alberto");
        alumnos[2] = new Alumnos(ThreadLocalRandom.current().nextInt(0, 11), "Pablo");
        alumnos[3] = new Alumnos(ThreadLocalRandom.current().nextInt(0, 11), "Dani");
        alumnos[4] = new Alumnos(ThreadLocalRandom.current().nextInt(0, 11), "Alejandro");
        for (int i = 0; i < 5; i++) {
            notas[i] = alumnos[i].getNota();
            nomes[i] = alumnos[i].getNome();
        }
        array.imprimirDeterminado("Pablo", notas, nomes);
        array.nomeAprobados(notas, nomes);
        notas = array.ordenar(notas);
        System.out.println(notas.toString());
        String nome = JOptionPane.showInputDialog("Ingrese un nome: ");
        array.imprimirDeterminado(nome, notas, nomes);

    }
}
