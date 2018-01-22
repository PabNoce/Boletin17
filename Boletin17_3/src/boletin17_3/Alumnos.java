/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_3;

/**
 *
 * @author pnocedalopez
 */
public class Alumnos {

    private int nota;
    private String nome;

 

    public Alumnos(int nota, String nome) {
        this.nota = nota;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

}
