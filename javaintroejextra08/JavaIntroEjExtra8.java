/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra8;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
        //debe detener la lectura y mostrar la cantidad de números leídos, 
        //la cantidad de números pares y la cantidad de números impares. 
        //Al igual que en el ejercicio anterior los números negativos no deben sumarse.
        
        Scanner leer = new Scanner(System.in);
        int contn = 0;
        int contpar = 0;
        int contimpar = 0;

        while (true) {
            System.out.println("Ingrese un numero: ");
            int n = leer.nextInt();
            if (n % 5 == 0) {
                break;
            }
            else if (n % 2 == 0) {
                contpar++;   
                contn++;
            }
            else {
                contimpar++;
                contn++;
            }
        }

        System.out.println("Total numeros: " + contn);
        System.out.println("Total numeros pares: " + contpar);
        System.out.println("Total numeros impares: " + contimpar);

    }
    
}
