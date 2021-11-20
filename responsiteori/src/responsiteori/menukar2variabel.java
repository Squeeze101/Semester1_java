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
public class menukar2variabel {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        int a,b;
        System.out.print("Masukan a:");
        a=keyboard.nextInt();
        System.out.print("Masukan b:");
        b=keyboard.nextInt();
        
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("Menukar Nilai Berhasil :");
        System.out.println("Nilai a :"+a);
        System.out.println("Nilai b :"+b);
    }
}
