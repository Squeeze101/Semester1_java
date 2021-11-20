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
public class mengurutkan_3_bilangan_acak {
    public static void main(String[] args){
    int a,b,c;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Masukan Angka Pertama :");
    a=keyboard.nextInt();
    System.out.print("Masukan Angka Kedua :");
    b=keyboard.nextInt();
    System.out.print("Masukan Angka Ketiga :");
    c=keyboard.nextInt();
    
    if(a<b && a<c && b<c){
        System.out.println("Urutan Angka");
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
    else if(a<b && a<c && c<b){
        System.out.println("Urutan Angka");
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
    }
    else if(b<a && b<c && a<c){
        System.out.println("Urutan Angka");
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
    }
    else if(b<a && b<c && c<a){
        System.out.println("Urutan Angka");
        System.out.println(a);
        System.out.println(c);
        System.out.println(b);
    }
    else if(c<a && c<b && a<b){
        System.out.println("Urutan Angka");
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
    }
    else {
        System.out.println("Urutan Angka");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
}