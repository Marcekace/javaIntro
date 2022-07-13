/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra11;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que lea un número entero y devuelva el número de dígitos que componen 
        //ese número. Por ejemplo, si introducimos el número 12345, 
        //el programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
        //utilizando el operador de división
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = leer.nextInt();
        int cont = 1;
        int digitos = 0;
        
        while (cont <= n) {
            if (n / cont != 0) {
                digitos++;
                cont *= 10;
            }
        }
        System.out.println("La cantidad de digitos que tiene el numero es: " + digitos);
           
    }
    
}
