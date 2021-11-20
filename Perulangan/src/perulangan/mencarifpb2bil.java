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
public class mencarifpb2bil {
    public static void main (String[] args ){
        int bil1,bil2,sisa;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Masukan Bilangan Pertama :");
        bil1=keyboard.nextInt();
        System.out.print("Masukan Bilangan Kedua :");
        bil2=keyboard.nextInt();
        
        if(bil1<bil2){
            int temp=bil1;
            bil1=bil2;
            bil2=temp;
        }
        do {
            sisa=bil1%bil2;
            bil1=bil2;
            bil2=sisa;
        }while(sisa != 0);
        System.out.println("Faktor Persekutuan Terbesar adalah ="+bil1);
    }
}
