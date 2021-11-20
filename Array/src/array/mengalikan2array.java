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
public class mengalikan2array {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int kolom1,kolom2,baris1,baris2;
        do {
            System.out.print("Masukan Baris Matriks 1 : ");
            baris1=keyboard.nextInt();
            System.out.print("Masukan Kolom Matriks 1 : ");
            kolom1=keyboard.nextInt();      
            System.out.print("Masukan Baris Matriks 2 : ");
            baris2=keyboard.nextInt();
            System.out.print("Masukan Kolom Matriks 2 : ");
            kolom2=keyboard.nextInt();           
        }while(kolom1 != baris2);
        
        int[][] matriks1 = new int[baris1][kolom1];
        
        System.out.println("\nMatriks 1");
        for(int i=0;i<baris1;i++){
            for(int j=0;j<kolom1;j++){
                System.out.print("Masukan baris ke-" + i + "kolom ke -" + j + "\t: ");
                matriks1[i][j]=keyboard.nextInt();
            }
        }
        int[][] matriks2 = new int[baris1][kolom1];
        
        System.out.println("\nMatriks 2");
        for(int i=0;i<baris2;i++){
            for(int j=0;j<kolom2;j++){
                System.out.print("Masukan baris ke-" + i + "kolom ke -" + j + "\t: ");
                matriks2[i][j]=keyboard.nextInt();
            }
        }
        System.out.println("\nMatriks Perkalian");
        int[][] nperkalian = new int [baris1][kolom2];
        for(int i=0;i<baris1;i++){
          for(int j=0;j<kolom2;j++){
              int x=0;
              for(int k=0; k<baris2;k++) {
                  x += matriks1[i][k] * matriks2[k][j];
              }
              nperkalian[i][j]=x;   
            }
        }
        for(int i=0;i<baris1;i++){
            for(int j=0;j<kolom2;j++){
                
                System.out.print("|\t" + nperkalian[i][j] + "\t|\t");
            }
            System.out.println();
        }
    } 
}
