/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEj01 {

    /**
     * @param args the command line arguments
     * Escribir un programa que pida dos números enteros por teclado
     * y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese el primer numero: ");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int n1 = leer.nextInt();
        
        int res = n + n1 ;
        System.out.println("El resultado de la suma es: " + res);
        
    }
    
}
