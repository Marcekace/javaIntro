/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra19;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que averigüe si dos vectores de N enteros son iguales 
        //(la comparación deberá detenerse en cuanto se detecte alguna diferencia 
        //entre los elementos).
        
        int[] vector1 = {4, 5, 6, 90, 12};
        int[] vector2 = {5, 4, 90, 6, 12};
        int cont = 0;
        
        for (int i = 0; i < vector1.length; i++){
            for (int j = 0; j < vector2.length; j++){
                if (vector1[i] == vector2[j]) {
                    cont++;
                }
            }
        }
        if (cont == vector1.length) {
            System.out.println("Ambos vectores son iguales.");
        }
        else {
            System.out.println("Ambos vectores no son iguales.");
        }
    }
    
}
