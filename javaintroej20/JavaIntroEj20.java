/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej20;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEj20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
        //donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
        //Crear un programa que permita introducir un cuadrado por teclado 
        //y determine si este cuadrado es mágico o no. 
        //El programa deberá comprobar que los números introducidos son correctos, 
        //es decir, están entre el 1 y el 9.
        
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int sumf = 0;
        int sumc = 0;
        int sumd1 = 0;
        int sumd2 = 0;
        int k = 2;
        
        // Rellena la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor para el elemento [" + i + "][" + j + "]");
                matriz[i][j] = leer.nextInt();
            }
        }  
        // Comnprueba las filas, columnas y diagonales. 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumf += matriz[i][j];
                sumc += matriz[j][i];
            }
            sumd1 += matriz[i][i];
            sumd2 += matriz[k][i];
            k--;
        }
        sumf /= 3;
        sumc /= 3;
        
        if (sumf == 15 && sumc == 15 && sumd1 == 15 && sumd2 == 15) {
            System.out.println("El cuadrado es magico");
        }
        else {
            System.out.println("El cuadrado no es magico");
        }
    }
    
}
