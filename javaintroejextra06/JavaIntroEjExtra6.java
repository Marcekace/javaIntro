/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra6;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por 
        //debajo de 1.60 mts. y el promedio de estaturas en general.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas: ");
        int n = leer.nextInt();
        int cont = 1;
        float promb = 0;
        float promg = 0;
        int b = 0;

        while (cont <= n){
            System.out.println("Ingrese la altura de la persona: " + cont);
            float altura = leer.nextFloat();
            if (altura <= 1.60 ) {
                promb += altura;
                b++;
            }
            promg += altura;
            cont++;
        }

        System.out.println("Promedio de altura menor a 1.60m : " + promb / b);
        System.out.println("Promedio de altura general : " + promg / n);
        
    }
    
}
