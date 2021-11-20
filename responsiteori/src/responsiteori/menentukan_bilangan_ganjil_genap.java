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
public class menentukan_bilangan_ganjil_genap {
    public static void main(String[] args){
    int a;
    Scanner keyboard=new Scanner(System.in);
    System.out.print("Masukan bilangan :");
    a=keyboard.nextInt();
    if(a%2==0){
        System.out.println("Genap");
    }
    else {
        System.out.println("Ganjil");
    }
    }
}
