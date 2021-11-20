/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author galileo
 */
public class Array2Dimensi {
    public static void main(String[] args) {
        int[][] array =new int [3][5];
        int[][] arraymatrix = {
            {0,1,2,3},
            {4,5,6,7},
            {8,9,10,11}
        };
        System.out.println("Ukuran Baris\t:"+arraymatrix.length);
        System.out.println("Ukuran Kolom\t:"+arraymatrix[0].length);
        
        System.out.println("\nOutput\t: ");
        for(int i=0; i< arraymatrix.length;i++){
            for(int j=0; j< arraymatrix[i].length;j++){
                System.out.println("Indeks " +
                        "baris ke - " +i +
                        " kolom ke - " + j +
                        "\t:" + arraymatrix[i][j]);
            }
            System.out.println();
        }
    }
}
