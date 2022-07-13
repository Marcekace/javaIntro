/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej17;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEj17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        int vector[] = new int[n];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un valor para la posicion vector[" + i + "]");
            vector[i] = leer.nextInt();
        }
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        
        for (int i = 0; i < vector.length; i++) {
            String longitud = String.valueOf(vector[i]);
            
            switch (longitud.length()) {
                case 1 :
                    cont1++;
                    break;
                case 2 :
                    cont2++;
                    break;
                case 3 :
                    cont3++;
                    break;
                case 4 :
                    cont4++;
                    break;
                case 5 :
                    cont5++;
                    break;
            }
        }
        
        System.out.println("Numeros de un digito " + cont1);
        System.out.println("Numeros de dos digitos " + cont2);
        System.out.println("Numeros de tres digitos " + cont3);
        System.out.println("Numeros de cuatro digitos " + cont4);
        System.out.println("Numeros de cinco digitos " + cont5);
    }
    
}
