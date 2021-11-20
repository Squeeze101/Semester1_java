/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsiteori;

import java.util.Scanner;

/**
 *
 * @author Galileo
 */
public class menampilkanbilangantercekecilkedua {
    public static void main(String[] args){
  
        Scanner keyboard=new Scanner(System.in);
        int a,b,c;
        System.out.print("Masukan a:");
        a=keyboard.nextInt();
        System.out.print("Masukan b:");
        b=keyboard.nextInt();
        System.out.print("Masukan c:");
        c=keyboard.nextInt();
        
        if(a<b && a>c){
            System.out.println("Nilai Terkecil Kedua :"+a);
        }
        else if(a>b && a<c){
            System.out.println("Nilai Terkecil Kedua :"+a);
        }
        else if (b<a && b>c){
            System.out.println("Nilai Terkecil Kedua :"+b);
        }
        else if(b>a && b<c) {
            System.out.println("Nilai Terkecil Kedua :"+b);
        }
        else if (c<b && a>c) {
            System.out.println("Nilai Terkecil Kedua :"+c);
        }
        else {
            System.out.println("Nilai Terkecil Kedua :"+c);
        }
                 
}
}
