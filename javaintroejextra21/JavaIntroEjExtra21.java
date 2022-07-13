/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejextra21;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEjExtra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
        //adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
        //Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos 
        //y 2 por parciales.
        //
        //Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
        //Al final del programa los profesores necesitan obtener por pantalla la cantidad de 
        //aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio 
        //mayor o igual al 7 de sus notas del curso.
        
        double [][] notas = {{ 9,   4, 10, 7, 0},
                             {10, 5.5,  8, 3, 0},
                             { 9,   7,  2, 5, 0},
                             {10, 8.5, 10, 9, 0},
                             {3.3,  1,  4, 7, 0},
                             {  8, 10,  6, 5, 0},
                             {  6,  4,  9, 9, 0},
                             {  7,  7,  7, 6, 0},
                             {  8,  7,  4, 9, 0},
                             {1.2,  6,  6, 7, 0}};
        
        int contap = 0;
        int contdep = 0;
        
        for (int i = 0; i < 10; i++) {
            double primPractico = (notas[i][0] * 10) / 100;
            double segPractico = (notas[i][1] * 15) / 100;
            double primInteg = (notas[i][2] * 25) / 100;
            double segInteg = (notas[i][3] / 2);
            notas[i][4] = (primPractico + segPractico + primInteg + segInteg);
        }
        for (int i = 0; i < 10; i ++) {
            if (notas[i][4] >= 7) {
                contap++;
            }
            else {
                contdep++;
            }
        }
        System.out.println("Alumnos aprobados: " + contap);
        System.out.println("Alumnos desaprobados: " + contdep); 
    }
    
}
