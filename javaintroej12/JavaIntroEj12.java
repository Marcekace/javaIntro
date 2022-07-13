/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej12;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);     
        int correcto = 0;
        int incorrecto = 0;
        String fde = "&&&&&";
        
        while (true) {
            System.out.println("Ingrese una cadena de 5 caracteres: ");
            String cadena = leer.nextLine();
            if (cadena.length() == 5) {
                if ( cadena.startsWith("X") && cadena.endsWith("O") ) {
                    correcto++;
                }
                else if ( cadena.equals(fde) ) {
                    System.out.println("Entradas correctas: " + correcto);
                    System.out.println("Entradas incorrectas: " + incorrecto);
                    break;
                }
                else {
                    incorrecto++;
                }
            }
            else {
                incorrecto++;
            }
        }
    }
    
}
