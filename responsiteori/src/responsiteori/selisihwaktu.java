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
public class selisihwaktu {
    public static void main(String[] args) {
        class waktu {
            int jam,menit,detik;
        }
        waktu w=new waktu();
        int a,b,hasil;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Format waktu 24 jam");
        System.out.println("Masukan Waktu dengan format (jam menit detik)");
        System.out.println("Contoh: 5 55 60\n");
        System.out.print("Masukan Waktu mulai :");
        w.jam=keyboard.nextInt();
        w.menit=keyboard.nextInt();
        w.detik=keyboard.nextInt();
        a=w.jam*3600+w.menit*60+w.detik;
        System.out.print("Masukan Waktu berakhir :");
        w.jam=keyboard.nextInt();
        w.menit=keyboard.nextInt();
        w.detik=keyboard.nextInt();
        b=w.jam*3600+w.menit*60+w.detik;
        
        while(a>b){
        System.out.println("Inputan Salah");
        System.out.println("Masukan waktu akhir lebih dari waktu mulai");
        System.out.print("Masukan Waktu berakhir :");
        w.jam=keyboard.nextInt();
        w.menit=keyboard.nextInt();
        w.detik=keyboard.nextInt();
        b=w.jam*3600+w.menit*60+w.detik;
        }
        
        hasil=b-a;
        w.jam=hasil/3600;
        w.menit=(hasil%3600) / 60;
        w.detik=(hasil%3600) %60;
        System.out.println("Selisih waktu nya adalah "+w.jam+" jam "+w.menit+ " menit "+ w.detik+ " detik.");
        
       
    }   
}
