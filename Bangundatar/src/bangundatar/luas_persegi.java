/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;
import java.util.Scanner;

/**
 *
 * @author galileo
 */
public class luas_persegi {

    
    static void getPanjangLebar()
    {
        int panjang = 0;
        int lebar = 0;
        
	Scanner sc = new Scanner(System.in);
        
	System.out.println("masukkan panjang : ");
	panjang = sc.nextInt();
        
	System.out.println("masukkan lebar : ");
	lebar = sc.nextInt();
        
        System.out.println("====== REKAP INPUTAN ======");
        System.out.println("Panjang\t : "+panjang+"cm");
        System.out.println("Lebar\t : "+lebar+"cm");
        
        int luas = hitungLuasPP(panjang, lebar);
        tampilLuasPP(luas);
    }
    
    static int hitungLuasPP(int panjang, int lebar)
    {
        int luas;
        luas = panjang*lebar;
        return luas;
    }
    static void tampilLuasPP(int luas)
    {
        System.out.println("Luas bangunan ini adalah "+luas+"cm");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        getPanjangLebar();
    }
}


