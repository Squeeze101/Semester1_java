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
public class menentukan_segitiga {
    public static void main(String[] args) {
        
    int a,b,c,panjang_a,panjang_b,panjang_c;
    
    Scanner keyboard =new Scanner(System.in);
    System.out.print("Masukan Nilai A :");
    a=keyboard.nextInt();
    System.out.print("Masukan Nilai B :");
    b=keyboard.nextInt();
    System.out.print("Masukan Nilai C  :");
    c=keyboard.nextInt();
    panjang_a=a*a;
    panjang_b=b*b;
    panjang_c=c*c;
    if (panjang_a<panjang_b+panjang_c){
        System.out.println("Segitiga Lancip");
    }
    else if(panjang_a > panjang_b+panjang_c) {
        System.out.println("Segitiga Tumpul");
    }
    else{
        System.out.println("Segitiga Siku-Siku ");
    }
}
}