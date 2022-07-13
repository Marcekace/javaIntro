/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej19;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEj19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
        // matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
        // signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
        // denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz: ");
        int n = leer.nextInt();
        double matrizA[][] = new double[n][n];
        // Matriz traspuesta
        double matrizB[][] = new double[n][n];
        int cont = 0;
      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
		//matrizA[i][j] = Math.round(Math.random() * 10);
		matrizB[j][i] = matrizA[i][j];
		if (matrizA[i][j] == matrizB[i][j]) {
			cont++;
		}
            }
        }

        System.out.println("Matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
		System.out.print(matrizA[i][j] + " "); 	
            }
            System.out.println("");
        }

        System.out.println("Matriz traspuesta");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
		System.out.print(matrizB[i][j] + " "); 	
            }
            System.out.println("");
        }

        if (cont == (n * n)) {
            System.out.println("La matriz es Anti Simetrica.");
        }
        else {
            System.out.println("La matriz no es Anti Simetrica.");
        }
    }
}
