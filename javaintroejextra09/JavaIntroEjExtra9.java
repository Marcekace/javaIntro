/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra9;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
        //realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
        //Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
        //este resultado es el residuo, y el número de restas realizadas es el cociente.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Divisor: ");
        int divisor = leer.nextInt();
        System.out.println("Ingrese el Dividendo: ");
        int dividendo = leer.nextInt();
        int cocciente = 0;
        int resto;

        while(divisor > dividendo) {
            divisor -= dividendo;
            cocciente++;
        }
        resto = divisor;

        System.out.println("Cocciente: " + cocciente);
        System.out.println("Resto: " + resto);

        
    }
    
}
