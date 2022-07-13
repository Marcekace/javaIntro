/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej04;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEj04 {

    /**
     * @param args the command line arguments
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
     * La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los centigrados: ");
        
        float c = leer.nextFloat();
        float f = 32 + (9 * c / 5);
        
        System.out.println("Los grados Fahrenheit son: " + f);
    }
    
}
