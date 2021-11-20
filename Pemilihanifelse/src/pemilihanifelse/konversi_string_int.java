/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemilihanifelse;
import java.util.Scanner;
/**
 *
 * @author galileo
 */
public class konversi_string_int {
    public static void main(String[] args) {        
        
        String b;
        int angka;
        int gagal=-1;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Masukan String :");
        b=keyboard.nextLine();
        switch(b) {
            case "0" : 
                 angka = Integer.parseInt(b);
                 System.out.println(angka);
                 break;
            case "1" : 
                 angka = Integer.parseInt(b);
                 System.out.println(angka);   
                 break;
            case "2" : 
                 angka = Integer.parseInt(b);
                 System.out.println(angka);
                 break;
            case "3" : 
                 angka = Integer.parseInt(b);
                 System.out.println(angka);
                 break;
            case "4" : 
                 angka = Integer.parseInt(b);
                 System.out.println(angka);
                 break;
            case "5" : 
                 angka = Integer.parseInt(b);
                 System.out.println(angka);
                 break;
            case "6" : 
                 angka = Integer.parseInt(b);
                 System.out.println(angka);
                 break;
            case "7" : 
                 angka = Integer.parseInt(b);
                 System.out.println(angka);
                 break;
            case "8" : 
                 angka = Integer.parseInt(b);
                 System.out.println(angka);
                 break;
            case "9" : 
                 angka = Integer.parseInt(b);
                 System.out.println(angka);
                 break;
            default : 
                System.out.println(gagal);
                 
        }
        
       
        
    }
   
}
