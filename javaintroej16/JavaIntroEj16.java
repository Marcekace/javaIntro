/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej16;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEj16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        double vector[] = new double [n];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.round(Math.random() * 10);
        }
        
        System.out.println("Ingrese el numero a buscar: ");
        int b = leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == b) {
                System.out.println("El numero se encuentra en la posicion: vector[" + i + "]");
            }
        }
    }
    
}
