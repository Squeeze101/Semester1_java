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
public class mencarikata {
    public static void main(String[] args){
        Scanner keyboard =new Scanner(System.in);
        Scanner keyboardint = new Scanner(System.in);
        System.out.print("Masukan Jumlah kata\t:");
        String[] array = new String[keyboardint.nextInt()];
        

        for(int i=0; i<array.length;i++) {
        System.out.print("Masukan kata\t:");
        array[i]=keyboard.nextLine();
        }
        
        System.out.print("\nMasukan kata yg ingin dicari :");
        String kata =keyboard.nextLine();
        boolean ketemu = false;
        
        for(int i=0; i<array.length;i++) {
            if(kata.equals(array[i])){
                System.out.println(kata +" ditemukan pada indeks ke-" + i);
                ketemu=true;
            }
        }
        if (ketemu==false){
            System.out.println(kata + " tidak ditemukan"); 
        }
    }
}
