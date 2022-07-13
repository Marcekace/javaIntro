/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej11;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEj11 {

    /**
     * @param args the command line arguments
     * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
     * y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
     * Tener en cuenta que, si el usuario selecciona la opción 5, 
     * en vez de salir del programa directamente, 
     * se debe mostrar el siguiente mensaje de confirmación: 
     * ¿Está seguro que desea salir del programa (S/N)? 
     * Si el usuario selecciona el carácter "S" se sale del programa, 
     * caso contrario se vuelve a mostrar el menú.
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2 = leer.nextInt();
        int op = 0;
        
        while (op != 6) {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion: ");
            op = leer.nextInt();
            
            switch (op) {
                case 1 :
                    System.out.println("El resultado es: " + (n1 + n2));
                    break;
                case 2 :
                    System.out.println("El resultado es: " + (n1 - n2));
                    break;
                case 3 :
                    System.out.println("El resultado es: " + (n1 * n2));
                    break;
                case 4 :
                    System.out.println("El resultado es: " + (n1 / n2));
                    break;
                case 5 :
                    System.out.println("Esta seguro que desa salir ? (s/n)");
                    String os = leer2.nextLine();
                    if (os.equals("s")) {
                        op = 6;
                        break;
                    }
            }
        }
        
    }
    
}
