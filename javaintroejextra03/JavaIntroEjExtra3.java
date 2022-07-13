/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra3;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Elaborar un algoritmo en el cuál se ingrese una letra y se detecte 
        //si se trata de una vocal. Caso contrario mostrar un mensaje.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        String l = leer.nextLine();

        if (l.equals("a") || l.equals("e") || l.equals("i") || l.equals("o") || l.equals("u")) {
            System.out.println("Es una vocal");
        }
        else {
            System.out.println("No es una vocal");
        }
        
    }
    
}
