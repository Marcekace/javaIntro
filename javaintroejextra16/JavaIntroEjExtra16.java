/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra16;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Diseñe una función que pida el nombre y la edad de N personas e 
        //imprima los datos de las personas ingresadas por teclado e indique si son mayores 
        //o menores de edad. Después de cada persona, el programa debe preguntarle al usuario 
        //si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
        
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas: ");
        int n = leer.nextInt();
        String persona[] = new String[n];
        int edad[] = new int[n];
        
        personas(n, persona, edad);
        for (int i = 0; i < n; i++) {
            fun(i, persona, edad);
            System.out.println("Desea seguir visualizando personas? Si/No");
            String conf = leer2.nextLine();
            if (conf.equalsIgnoreCase("No")) {
                break;
            }
        }
       
    }
    
    public static void fun (int cont, String[] p, int[] e) {
        if (e[cont] >= 18) {
            System.out.println("Nombre: " + p[cont]);
            System.out.println("Edad: " + e[cont]);
            System.out.println("La persona " + p[cont] + " es mayor de edad");
        }
        else {
            System.out.println("Nombre: " + p[cont]);
            System.out.println("Edad: " + e[cont]);
            System.out.println("La persona " + p[cont] + " es menor de edad");
        }
    }
    
    public static void personas (int n, String[]p, int[]e) {
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de la persona No: " + (i + 1));
            p[i] = leer.nextLine();
            System.out.println("Ingrese la edad de la persona No: " + (i + 1));
            e[i] = leer2.nextInt();
        }
    }
}
