/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra10;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realice un programa para que el usuario adivine el resultado de una multiplicación 
        //entre dos números generados aleatoriamente entre 0 y 10. 
        //El programa debe indicar al usuario si su respuesta es o no correcta. 
        //En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar 
        //su respuesta nuevamente.
        
        Scanner leer = new Scanner(System.in);
        float n1 = Math.round(Math.random() * 10);
        float n2 = Math.round(Math.random() * 10);
        float m = n1 * n2;
        int cont = 0;
        
        while (cont < 2) {
            System.out.println("Ingrese el resultado: ");
            float res = leer.nextFloat();
            if (res == m) {
                System.out.println("La respuesta ingresada es coccrecta");
                break;
            }
            System.out.println("La respuesta ingresada no es correcta");
            cont++;
        }
        
        
    }
    
}
