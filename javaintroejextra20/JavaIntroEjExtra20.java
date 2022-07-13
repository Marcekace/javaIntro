/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra20;

import java.util.Scanner;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una función rellene un vector con números aleatorios, 
        //pasándole un arreglo por parámetro. Después haremos otra función o procedimiento 
        //que imprima el vector.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el temaño del arreglo: ");
        int n = leer.nextInt();
        float vector[] = new float[n];
        
        llenarVector(vector);
        System.out.println("Vector: ");
        mostrarVector(vector);
        
    }
    
    public static void llenarVector(float[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = Math.round(Math.random() * 10);
        }
    }
    
    public static void mostrarVector(float[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + ", ");
        }
    }
    
}
