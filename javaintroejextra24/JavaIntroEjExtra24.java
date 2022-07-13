/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra24;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que complete un vector con los N primeros números 
        // de la sucesión de Fibonacci.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de la sucecion de Fibb: ");
        int n = leer.nextInt();
        int[] v = new int[n];
        
        sucFib(v, n);
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + ", ");
        }
    }
    
    public static void sucFib(int[] vector, int numero) {
        int n1 = 0;
        int n2 = 1;
        int cont = 1;
        vector[0] = 1;
        
        while (cont < numero) {
            vector[cont] = n1 + n2;
            n1 = n2;
            n2 = vector[cont];
            cont++;
        }
    }
}
