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
public class menentukan_jumlah_belanja {
    public static void main(String[] args) {
        int jumlah_belanja,total_belanja,diskon;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Masukan Jumlah Belanja :");
        jumlah_belanja=keyboard.nextInt();
        if (jumlah_belanja>150000) {
            diskon=jumlah_belanja*20/100;
            total_belanja=jumlah_belanja - diskon;
            System.out.println("Diskon Anda\t\t:"+diskon);
            System.out.println("Jumlah Belanja Anda\t:"+total_belanja);
        }
        else {
            System.out.println("Anda Belum mendapatkan diskon");
            System.out.println("Total Belanja :"+jumlah_belanja);
        }
    }
}
