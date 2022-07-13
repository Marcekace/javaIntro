/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej21;

/**
 *
 * @author marcelokacerovsky
 */
public class JavaIntroEj21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 3x3, 
        //se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
        //dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 
        //que se pueden formar en la matriz M, desplazándose por filas o columnas, 
        //existe al menos una que coincida con la matriz P. En ese caso, 
        //el programa debe indicar la fila y la columna de la matriz M en 
        //la cual empieza el primer elemento de la submatriz P.
        
        int[][] matrizM = {{ 1, 26, 36, 47,  5,  6, 72, 81, 95, 10},
                           {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
                           {56, 78, 87, 90,  9, 90, 17, 12, 87, 67},
                           {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
                           {32, 76, 79,  1, 36,  5, 67, 96, 12, 11},
                           {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
                           {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
                           {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
                           {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
                           {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        
        int[][] matrizP = {{36,  5, 67}, 
                           {89, 90, 75}, 
                           {14, 22, 26}};

        String matrizAux[][] = new String [3][3];

        
        int cont = 0;
        String posf;
        String posc;

        // cambia las filas
        for (int f = 0; f <= 6; f++) {
            // cambia las columnas
            for (int c = 0; c <= 6; c++) {
                for (int i = 0; i < 3; i++) {
                    for (int j= 0; j < 3; j++) {
                        if (matrizP[i][j] == matrizM [i + f][j + c]) {
                            posf = String.valueOf(i + f);
                            posc = String.valueOf(j + c);
                            matrizAux[i][j] = posf + "," + posc;
                            cont++;
                        }
 
                    }
                }
                if (cont == 9) {
                break;   
                }   
                cont = 0;
            }
        }
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                System.out.println("La submatrizP  se encuentra en los indices: " + matrizAux[i][j] + " ");
            }
            System.out.println("");
        }
        
        
    }
    
}
