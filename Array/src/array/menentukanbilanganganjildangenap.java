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
public class menentukanbilanganganjildangenap {
    public static void main(String [] args) {
        Scanner keyboard =new Scanner(System.in);
        System.out.print("Masukan jumlah bilangan\t:");
        int[] array = new int[keyboard.nextInt()];
        
        for(int i=0;i<array.length;i++){
            System.out.print("Masukan bilangan\t:");
            int nilai=keyboard.nextInt();
            array[i]=nilai;
        }
        System.out.println();
        System.out.print("Bilangan Ganjil\t:");
        for(int ganjil : array){
            if(ganjil % 2 !=0)
                System.out.print(ganjil + " ");    
        }
        System.out.println();
        System.out.print("Bilangan Genap\t:");
        for(int genap : array){
            if(genap % 2 ==0)
                System.out.print(genap + " ");    
    }
        System.out.println();
}
}