 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Scanner;
/**
 *
 * @author galileo
 */
public class Array2Dimensi_2 {
 public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int nilai;
        
        System.out.println("Array 2 Dimensi");
        System.out.print("Masukan baris \t:");
        int baris=keyboard.nextInt();
        
        System.out.print("Masukan kolom \t:");
        int kolom=keyboard.nextInt();
        
        int[][] arraymatrix=new int[baris][kolom];
        
        System.out.println("\nMasukan data\t:");
        for(int i=0; i<arraymatrix.length;i++){
            for(int j=0; j<arraymatrix[i].length;j++){
                System.out.print("Array ke ["+i+"]["+j+"]\t: " );
                arraymatrix[i][j]=keyboard.nextInt();
            }
        }
        System.out.println("\nOutput data\t: ");
        for(int i=0; i< arraymatrix.length;i++){
            for(int j=0; j< arraymatrix[i].length;j++){
                System.out.println("Data array ke [" + i +"]["+j+"]\t: "
                        +arraymatrix[i][j]);
            }
      
        }
}
}