/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

import java.util.Scanner;

/**
 *
 * @author galileo
 */
public class hitungrataratadowhile {
        public static void main(String[] args){
        int n,x,i;
        i=1;
        double rerata,penjumlah;
         penjumlah=0;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Masukan N :");
        n=keyboard.nextInt();
        do {
            System.out.print("Masukan X :");
            x=keyboard.nextInt();
            penjumlah=penjumlah+x;
            i++;
        }while(i<=n);
        rerata=penjumlah/n;
        System.out.println("Hasil Rata-rata :"+rerata); 
    }
}
