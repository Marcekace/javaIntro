/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra7;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realice un programa que calcule y visualice el valor máximo, 
        //el valor mínimo y el promedio de n números (n>0). 
        //El valor de n se solicitará al principio del programa y los números serán introducidos 
        //por el usuario. Realice dos versiones del programa, una usando el bucle “while” 
        //y otra con el bucle “do - while”.
        
        // 7.1
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros: ");
        int n = leer.nextInt();
        int v[] = new int[n];
        int cont = 0;

        if (n > 0) {
            while (cont < n) {
                System.out.println("Ingrese un numero :");
                v[cont] = leer.nextInt();
                cont++;
            }
            int min = v[0];
            int max = v[0];
            float prom = 0;
            for (int i = 0; i < n; i++) {
                prom += v[i];
                if (min > v[i]){
                    min = v[i];
                }
                else if (max < v[i]){
                    max = v[i];
                }
            }
            System.out.println("Maximo: " + max);
            System.out.println("Minimo: " + min);
            System.out.println("Promedio: " + prom / n);
        }
        else {
            System.out.println("'n' debe ser mayor a 0");
        }

        // 7. 2
        System.out.println("Ingrese la cantidad de numeros: ");
        int n2 = leer.nextInt();
        int v2[] = new int[n2];
        int cont2 = 0;
        
        if (n2 > 0) {
            do {
                System.out.println("Ingrese un numero :");
                v2[cont2] = leer.nextInt();
                cont2++;
            } while (cont2 < n2);
            int min2 = v[0];
            int max2 = v[0];
            float prom2 = 0;
            for (int i = 0; i < n2; i++) {
                prom2 += v2[i];
                if (min2 > v2[i]){
                    min2 = v2[i];
                }
                else if (max2 < v2[i]){
                    max2 = v2[i];
                }
            }
            System.out.println("Maximo: " + max2);
            System.out.println("Minimo: " + min2);
            System.out.println("Promedio: " + prom2 / n2);
        }
        else {
            System.out.println("'n' debe ser mayor a 0");
        }
        
        
        
        
        
        
    }
    
}
