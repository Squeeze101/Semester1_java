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
public class Fotocopy {
    public static void main (String[] args) {
       String pelanggan;
       int kertas,total,potongan;
       Scanner keyboard=new Scanner(System.in);
       Scanner input=new Scanner(System.in);
       System.out.print("Masukan Jumlah Fotocopy Anda :");
       kertas=keyboard.nextInt();
       System.out.print("Apakah Anda Pelanggan(Ya/Tidak):");
       pelanggan=input.nextLine();

       
       if(kertas<100 && pelanggan.equalsIgnoreCase("Ya")){
           total=kertas*75;
           potongan=kertas*5;
           System.out.println("Jumlah Lembar Fotocopy\t:"+kertas);
           System.out.println("Besar Potongan Harga\t:"+potongan);
           System.out.println("Total Jumlah Harga\t:"+total);
       }
       else if(kertas>=100 && pelanggan.equalsIgnoreCase("Ya")) {
           total=kertas*65;
           potongan=kertas*15;
           System.out.println("Jumlah Lembar Fotocopy\t:"+kertas);
           System.out.println("Besar Potongan Harga\t:"+potongan);
           System.out.println("Total Jumlah Harga\t:"+total);
       }
       else if(kertas>=200 && pelanggan.equalsIgnoreCase("Tidak")) {
           total=kertas*70;
           potongan=kertas*10;
           System.out.println("Jumlah Lembar Fotocopy\t:"+kertas);
           System.out.println("Besar Potongan Harga\t:"+potongan);
           System.out.println("Total Jumlah Harga\t:"+total); }
        else {
           total=kertas*80;
           System.out.println("Jumlah Lembar Fotocopy\t:"+kertas);
           System.out.println("Besar Potongan Harga\t:"+0);
           System.out.println("Total Jumlah Harga\t:"+total);
                   }
    

    }
}
