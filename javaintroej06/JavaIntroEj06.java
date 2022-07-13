/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej06;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEj06 {

    /**
     * @param args the command line arguments
     * Crear un programa que dado un numero determine si es par o impar.
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = leer.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("El numero " + n + " es par.");
        }
        else {
            System.out.println("El numero " + n + " es impar.");
        }
    }
    
}
