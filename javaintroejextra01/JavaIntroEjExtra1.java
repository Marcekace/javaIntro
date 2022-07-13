/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra1;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
        //si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos: ");
        int minutos = leer.nextInt();

        convertir(minutos);
        
    }
    
    public static void convertir (int min ) {
        int dias = min / 1440;
        min -= dias * 1440;
        float hs = min / 60;

        if (dias >= 1) {
            System.out.println(dias + " dias y " + hs + " horas");
        }
        else {
        System.out.println(hs + " horas");
        }
    }
    
}
