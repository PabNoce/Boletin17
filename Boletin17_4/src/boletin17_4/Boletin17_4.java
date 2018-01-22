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
public class Boletin17_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    DNI dni=new DNI(45256935);
    String[] letter={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        System.out.println("Letra: "+dni.calcularLetra(dni.getNif(), letter));
    }
    
}
