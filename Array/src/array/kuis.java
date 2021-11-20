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
public class kuis {
        public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        Scanner keyboardchars=new Scanner(System.in);
        String string;
        int angka;
        char kata;
        System.out.print("Masukan String\t:");
        string=keyboard.nextLine();
        System.out.print("Masukan kata\t:");
        kata=keyboardchars.next().charAt(0);
        System.out.print("Masukan Integer\t:");
        angka=keyboard.nextInt();
        
        System.out.println("\nHasil String\t:" + string);
        System.out.println("Hasil kata\t:" + kata);
        System.out.println("Hasil angka\t:" + angka);
    }
}


