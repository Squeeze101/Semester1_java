/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;
import java.util.Scanner;
/**
 *
 * @author galileo
 */
public class soalno2 {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("<< MENU MENGHITUNG BIAYA OPERASI >>");
        System.out.println("1. Hitung Biaya Operasi Mata");
        System.out.println("2. Hitung Biaya Operasi Jantung\n\n");
        System.out.print("Masukan Pilihan Anda :");
        int pilihan=keyboard.nextInt();
        String biaya;
        if(pilihan==1){
            System.out.println("\nJENIS PENYAKIT ANDA\n1. Katarak\n2. Plus/Minus\n3. Silinder\n\n");
            System.out.print("Masukan Jenis Penyakit Mata: ");
            int mata=keyboard.nextInt();
            switch(mata){
                case  1: 
                    biaya="Biayanya adalah Rp.7.500.000";
                break;
                 case 2: 
                    biaya="Biayanya adalah Rp.5.000.000";
                break;               
                case 3 : 
                    biaya="Biayanya adalah Rp.4.000.000";
                break;  
                default :
                    biaya="Tidak ada dalam operasi.";
                    break;
            }
            System.out.println(biaya);
        }
        else{
            System.out.println("\nJENIS PENYAKIT ANDA\n1. Jantung Koroner\n2. Katup Jantung\n3. Otot Jantung\n\n");
            System.out.print("Masukan Jenis Penyakit Mata: ");
            int jantung=keyboard.nextInt();
            switch(jantung){
                case 1 : 
                    biaya="Biayanya adalah Rp.500.000.000";
                break;
                 case 2 : 
                    biaya="Biayanya adalah Rp.350.000.000";
                break;               
                 case 3 : 
                    biaya="Biayanya adalah Rp.450.000.000";
                break;        
                 default :
                    biaya="Tidak ada dalam operasi.";
                break;
    }
          System.out.println(biaya);
}
    }
}