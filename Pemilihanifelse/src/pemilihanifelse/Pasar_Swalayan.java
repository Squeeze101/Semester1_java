/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemilihanifelse;

import java.util.Scanner;

public class Pasar_Swalayan {

    public static void main(String[] args) {
        int nilai_belanja_1, nilai_belanja_2, nilai_belanja_3, nilai_belanja_4,hemat_1, hemat_2, hemat_3;
        Scanner scr = new Scanner(System.in);
        
        System.out.print("Masukkan total nilai belanja : ");
        nilai_belanja_1 = scr.nextInt();
        nilai_belanja_2 = nilai_belanja_1-(nilai_belanja_1%25);
        nilai_belanja_3 = nilai_belanja_1-(nilai_belanja_1%50);
        nilai_belanja_4 = nilai_belanja_1-(nilai_belanja_1%100);
        
        hemat_1=nilai_belanja_1%25;
        hemat_2=nilai_belanja_1%50;
        hemat_3=nilai_belanja_1%100;
                if (hemat_1==0) {
            System.out.println("Anda harus membayar  : "+nilai_belanja_1);
                }
            else if (hemat_1>0) {
            System.out.println("Anda harus membayar : "+nilai_belanja_2);
            System.out.println("Anda hemat : "+hemat_1);
        }
            else if (hemat_2==0) {
            System.out.println("Anda harus membayar  : "+nilai_belanja_1);
           
        }   
           else if (hemat_2>0){
            System.out.println("Anda harus membayar : "+nilai_belanja_3);
            System.out.println("Anda hemat : "+hemat_2);
        }

         else if (hemat_1==0) {
            System.out.println("Anda harus membayar  : "+nilai_belanja_1);
            
        } 
        else if (hemat_1>0){
            System.out.println("Anda harus membayar  : "+nilai_belanja_3);
            
            System.out.println("Anda hemat : "+hemat_3);
        }
        else {
            System.out.println("Anda harus membayar  : "+nilai_belanja_1);
        }
        
    }
}