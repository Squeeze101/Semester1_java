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
public class menentukan_bilangan_positfi_dan_kelipatan_6 {
    public static void main(String[] args) {
        int angka;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Masukan Bilangan :");
        angka=keyboard.nextInt();
        if (angka>=1 && angka % 6 ==0) {
            System.out.println("Angka Adalah bilangan positif dan kelipatan 6");
        }
        else if (angka<0) {
            System.out.println("bukan Merupakan bilangan positif");
        }
        else {
            System.out.println("merupakan bilangan positif tapi bukan kelipatan 6");
        }
                
    }
}
