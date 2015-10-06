/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg2;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float lado;
        System.out.println("Introduce el lado del cuadrado");
        Scanner ladoTeclado = new Scanner(System.in);
        lado = ladoTeclado.nextFloat();
        System.out.println("El area del cuadrado es: "+lado*lado);
        
    }
    
}
