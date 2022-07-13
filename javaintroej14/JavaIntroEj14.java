/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej14;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Euros aconvertir: ");
        float euros = leer.nextFloat();
        
        convertir(euros,"libras");
        convertir(euros,"dolares");
        convertir(euros,"yenes");
        
    }
    
    public static void convertir(float euros, String moneda) {
        
        if (moneda.equals("libras")){
            System.out.println("El total es " + (euros * 0.86) + " libras");
        }
        else if (moneda.equals("dolares")) {
            System.out.println("El total es " + (euros * 1.28611) + " dolares");
        }
        else if (moneda.equals("yenes")) {
            System.out.println("El total es " + (euros * 129.852) + " yenes");
        }
    }
    
}
