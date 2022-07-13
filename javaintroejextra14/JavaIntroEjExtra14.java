/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra14;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos.
        //Escriba un programa que pida la cantidad de familias y para cada familia la cantidad 
        //de hijos para averiguar la media de edad de los hijos de todas las familias.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias: ");
        int familias = leer.nextInt();
        int cont = 1;
        float sumh = 0;
        
        while (cont <= familias) {
            System.out.println("Ingrese la cantidad de hijos de la familia No: " + cont);
            sumh += leer.nextInt();
            cont++;
        }
        
        System.out.println("La media de hijos de todas las familas es: " + sumh / familias); 
    }
    
}
