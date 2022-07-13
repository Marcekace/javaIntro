/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra13;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que dibuje una escalera de números, donde cada línea de números 
        //comience en uno y termine en el número de la línea. 
        //Solicitar la altura de la escalera al usuario al comenzar
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera: ");
        int n = leer.nextInt();
        int cont = 1;
        String n2 = "";
        
        while (cont <= n) {
            n2 += String.valueOf(cont);
            System.out.println(n2);
            cont++;
        }
        
    }
    
}
