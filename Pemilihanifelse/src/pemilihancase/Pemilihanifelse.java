/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemilihancase;
import java.util.Scanner;
/**
 *
 * @author galileo
 */
public class Pemilihanifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai,sks=2,skor;
        String mk;
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan Mata Kuliah :");
        mk=input.nextLine();
        System.out.print("Masukan Nilai :");
        nilai =input.nextInt();
        if (nilai<0) {
            System.err.println("Nilai Minimal 0");
        }
        else if (nilai>100) {
            System.err.println("Nilai Maksimal 100");
        }
        else if (nilai>=90){
                skor=4*sks;
                System.out.println("Nilai Anda\t:A");
                System.out.println("Nilai Skor Anda\t:"+skor);
        }
        else if(nilai>=80 && nilai<90){
                skor=3*sks;
                System.out.println("Nilai Anda\t:B");
                System.out.println("Nilai Skor Anda\t:"+skor);
        }
        else if (nilai>=60 && nilai<80){
                skor=2*sks;
                System.out.println("Nilai Anda\t:C");
                System.out.println("Nilai Skor Anda\t:"+skor);
        }
        else if ( nilai>=50 && nilai <60){
            skor=1*sks;
            System.out.println("Nilai Anda\t:D");
            System.out.println("Nilai Skor Anda\t:"+skor);
        }
        else {
                System.out.println("Nilai Anda E");
        }
        
        
    }
    
}
