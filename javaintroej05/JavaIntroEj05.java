/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej05;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEj05 {

    /**
     * @param args the command line arguments
     * Escribir un programa que lea un número entero por teclado 
     * y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        
        int n = leer.nextInt();
        int d = n * 2;
        int t = n * 3;
        double c = Math.sqrt(n);
        
        System.out.println("Doble: " + d);
        System.out.println("Triple: " + t);
        System.out.println("Raiz: " + c);
    }
    
}
