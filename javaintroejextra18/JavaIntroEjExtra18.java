/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra18;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
        //con los valores ingresados por el usuario.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        float[] vector = new float[n];
        float sumvector = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor del elemento: [" + i + "]");
            vector[i] = leer.nextFloat();
            sumvector += vector[i];
        }
        
        System.out.println("Vector: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + ", ");
        }
        System.out.println("");
        System.out.println("Suma del vector: " + sumvector);
        
    }
    
}
