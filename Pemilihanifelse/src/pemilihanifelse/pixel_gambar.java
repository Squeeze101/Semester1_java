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
public class pixel_gambar {
    public static void main(String[] args){
        
        int angka,hasil;
        int pixel=255;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Nilai Hasil Pengelohan Citra :");
        angka=keyboard.nextInt();
        if(angka>255) {
            angka=pixel;
            System.out.println(angka);
        }
        else if(angka<0){
            angka=0;
            System.out.println(angka);
        }
        else 
            System.out.println(angka);
    }
}
