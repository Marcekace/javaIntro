/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej10;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEj10 {

    /**
     * @param args the command line arguments
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
     * números al usuario hasta que la suma de los números introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int l = leer.nextInt();
        int sum = 0;
        
        while (sum < l) {
            System.out.println("Ingrese un numero: ");
            int n = leer.nextInt();
            sum += n;
        }
    }
    
}
