/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author galileo
 */
public class contoh {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        System.out.print ("nama: ");
        String nama = in.nextLine();
        
        System.out.print("usia: ");
        int usia = in.nextInt();
        
        System.out.println("Nama saya "+ nama +" usia " + usia +" tahun");
        
        //cetak angka 1-usia
        int i;
        for (i=1;i<=usia;i++) {
            System.out.println("i ="+i);
        }
        
             
        
        
    }
}
