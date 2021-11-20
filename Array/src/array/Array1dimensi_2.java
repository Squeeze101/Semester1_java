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
public class Array1dimensi_2 {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Inputkan ukuran array:");
        int panjang=keyboard.nextInt();
        
        int[] arraynilai = new int[panjang];
        int nilai;
        System.out.println("Masukan data\t:");
        for(int i=0;i<arraynilai.length; i++) {
            System.out.print("Masukan Indeks ke-" + i +"\t:");
            nilai =keyboard.nextInt();
            arraynilai[i]=nilai;
        }
        System.out.println("\nHasil Input\t: ");
        for(int x :arraynilai){
            if (x <= 10) {
                System.out.println("Output Indeks\t: " + x);
            }
        }
    }
}
