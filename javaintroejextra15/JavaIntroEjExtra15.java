/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra15;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
        //restar, multiplicar y dividir. La aplicación debe tener una función 
        //para cada operación matemática y deben devolver sus resultados para imprimirlos en el main.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        float n1 = leer.nextFloat();
        System.out.println("Ingrese el segundo numero: ");
        float n2 = leer.nextFloat();
        int op = 0;
        
        while (op != 5) {
            System.out.println("Elija una opcion: ");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            op = leer.nextInt();
            
            
            switch (op) {
                case 1:
                    System.out.println(sumar(n1, n2));
                    break;
                case 2:
                   System.out.println(restar(n1, n2));
                   break;
                case 3:
                    System.out.println(multiplicar(n1, n2));
                    break;
                case 4:
                    System.out.println(dividir(n1, n2));
                    break;
                case 5:
                    op = 5;
                    break;
            }
        }
        
    }
    
    public static float sumar (float numero1, float numero2) {
        float suma = numero1 + numero2;
        
        return suma;
    }
    
    public static float restar (float numero1, float numero2) {
        float resta = numero1 - numero2;
        
        return resta;
    }
    
    public static float multiplicar (float numero1, float numero2) {
        float mul = numero1 * numero2;
        
        return mul;
    }
    
    public static float dividir (float numero1, float numero2) {
        float div = numero1 / numero2;
        
        return div;
    }
}
