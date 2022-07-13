/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra22;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
        //muestre la suma de sus elementos.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de 'N' :");
        int n = leer.nextInt();
        System.out.println("Ingrese el valor de 'M' :");
        int m = leer.nextInt();
        double[][] matriz = new double[n][m];
        double sumMatriz = 0;

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matriz[i][j] = Math.round(Math.random() * 10);
                sumMatriz += matriz[i][j];
            }
        }
        // Mostrar Matriz
        System.out.println("Matriz: ");
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + ", ");
            }
            System.out.println(" ");
        }
        System.out.println("Suma de la matriz: " + sumMatriz);
    }
    
}
