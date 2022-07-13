/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra23;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
        //a medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
        //de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
        //en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación 
        //de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
        //Finalmente imprima por pantalla la sopa de letras creada.
        
        Scanner leer = new Scanner(System.in);
        String palabra;
        int cont = 0;
        int cpar = 1;
        String[][] sopaLetras = new String[20][20];
        int[] filas = new int[5];
        
        do {
            System.out.println("Ingrese una palabra de 3 a 5 caracteres: ");
            palabra = leer.nextLine().toUpperCase();
            if (palabra.length() >= 3 && palabra.length() <= 5) {
                if (cpar % 2 != 0) {
                    int n = (int) (Math.random() * 10);
                    for (int i = 0; i < palabra.length(); i++) {
                        sopaLetras[n][i] = palabra.substring(i, i + 1);
                    }
                    for (int i = palabra.length(); i < 20; i++) {
                        sopaLetras[n][i] = String.valueOf((int) (Math.random() * 10));
                    }
                    filas[cont] = n;
                    cpar++;
                }
                else {
                    int n = ((int) (Math.random() * 10)) + ((int) (Math.random() * 10));
                    if (n >= 20) {
                        n--;
                    }
                    for (int i = 0; i < palabra.length(); i++) {
                        sopaLetras[n][i] = palabra.substring(i, i + 1);
                    }
                    for (int i = palabra.length(); i < 20; i++) {
                        sopaLetras[n][i] = String.valueOf((int) (Math.random() * 10));
                    }
                    filas[cont] = n;
                    cpar++;
                }
                cont++;
            }
            else {
                System.out.println("La palabra ingresada es invalida.");
            }
        } while (cont < 5);

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (i != filas[0] && i != filas[1] && i != filas[2] && i != filas[3] && i != filas[4]) {
                    sopaLetras[i][j] = String.valueOf((int) (Math.random() * 10));
                }   
            }
        }
        // Imprime la sopa de letras
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopaLetras[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
    
}
