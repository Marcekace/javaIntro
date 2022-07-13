/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej13;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = leer.nextInt();
        int cont = 0;
        int f = 0;
        String c = "*";
        
        while (cont < n) {
            System.out.print(c + " ");
            cont++;
        }
        System.out.println("");
        cont = 0;
        int esp = (n - 1) + (n - 2);
        while (f < (n - 2)) {
            System.out.print(c);
            while (cont < esp) {
                System.out.print(" ");
                cont++;
            }
            System.out.print(c);
            f++;
            cont = 0;
            System.out.println("");
        }
        while (cont < n) {
            System.out.print(c + " ");
            cont++;
        }
    }
    
}
