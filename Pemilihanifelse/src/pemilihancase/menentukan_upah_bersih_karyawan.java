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
public class menentukan_upah_bersih_karyawan {
    public static void main(String[] args) {
        int jjk,lembur;
        String nama;
        int upah;
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan Nama\t\t\t :");
        nama=input.nextLine();
        System.out.print("Masukan Jumlah Jam Kerja\t :");
        jjk=input.nextInt();
        if(jjk<=48) {
            upah=jjk*2000;
            System.out.println("upah anda "+upah);
        }
        else{
            lembur=jjk-48;
            upah=48*2000 + lembur *3000;
            System.out.println("upah anda "+upah);
        }
        
    }
}
