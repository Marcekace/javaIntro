/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra17;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
        //por parámetro para que nos indique si es o no un número primo, 
        //debe devolver true si es primo, sino false
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = leer.nextInt();
        
        System.out.println(primos(n));
    }
    
    public static boolean primos(int numero) {
        int cont = 1;
        int cont2 = 0;
        
        while (cont <= numero) {
            if (numero % cont == 0) {
                cont2++;
                cont++;
            }
            else {
                cont++;
            }
        }
        if (cont2 > 2) {
            return false;
        }
        else {
            return true;
        }
    }
}
