/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej15;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEj15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int[100];
        rellenarVector(vector);
        mostrarVector(vector);
        
    }
    
    public static void rellenarVector(int vector[]) {
        
        for (int i = 0; i < 100; i++) {
            vector[i] = i;
        }
    }
    
    public static void mostrarVector(int vector[]) {
        
        for (int i = 0; i < 100; i++) {
            System.out.print(vector[i]);
        }
    }
    
}
