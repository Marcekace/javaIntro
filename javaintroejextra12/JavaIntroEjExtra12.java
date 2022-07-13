/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra12;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0- 0 
        // al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero desde 0 hasta 999");
        int numero = leer.nextInt();
        String contador = "";
        
        for (int i = 0; i < 3; i++) {
            String n2 = String.valueOf(numero);
            if (n2.substring(i, i + 1).equals("3")) {
                contador += "E" + "-";
            }
            else {
                contador += n2.substring(i, i + 1) + "-";
            }
        }
        contador = contador.substring(0, 5);
        System.out.println(contador);
        
    }
    
}
