/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra5;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Una obra social tiene tres clases de socios:
        //o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
        //todos los tipos de tratamientos.
        //o Los socios tipo ‘B’ abonan una cuota moderada y 
        //tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
        //o Los socios que menos aportan, los de tipo ‘C’, 
        //no reciben descuentos sobre dichos tratamientos.
        //o Solicite una letra (carácter) que representa la clase de un socio, 
        //y luego un valor real que represente el costo del tratamiento (previo al descuento) 
        //y determine el importe en efectivo a pagar por dicho socio.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de socio:");
        String tipo = leer.nextLine();
        System.out.println("Ingrese el monto del tratamiento: ");
        int monto = leer.nextInt();
        int tratamiento = 0;

        if (tipo.equals("A")) {
            tratamiento = monto / 2;
            System.out.println("El importe a abonar es de: $" + tratamiento);
        }
        else if (tipo.equals("B")) {
            tratamiento = monto - ((monto * 35) / 100);
            System.out.println("El importe a abonar es de: $" + tratamiento);
        }
        else if (tipo.equals("C")) {
            tratamiento = monto;
            System.out.println("El importe a abonar es de: $" + tratamiento);
        }
        else {
            System.out.println("Tipo de socio invalido");
        }
    }
    
}
