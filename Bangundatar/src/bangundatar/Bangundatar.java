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
public class Bangundatar {
    static  void getpanjanglebardiameter()
    {
        int panjang ;
        int lebar ;
        double diameter;
        double phi=3.14;
        
        Scanner keyboard=new Scanner(System.in);
        
        System.out.print("Masukan panjang :");
        panjang=keyboard.nextInt();
        System.out.print("Maukan lebar :");
        lebar=keyboard.nextInt();
        System.out.print("Masukan Diameter :");
        diameter=keyboard.nextInt();
        System.out.println("====== REKAP INPUTAN ======");
        System.out.println("Panjang\t : "+panjang +"cm");
        System.out.println("Lebar\t : "+lebar+"cm");
        System.out.println("Diameter\t : "+diameter+"cm");
        
        int luas = hitungLuasPP(panjang, lebar);
        double LuasSetengahLingkaran =hitungSetengahLingkaran(diameter);
        double hitungLuasGabungann=hitungLuasGabungan(luas,LuasSetengahLingkaran);
        tampilGabungan(hitungLuasGabungann);
    }

    static int hitungLuasPP(int panjang, int lebar)
    {
        int luas;
        luas = panjang*lebar;
        return luas;
    }
static double hitungSetengahLingkaran(double diameter)
    {
        double LuasSetengahLingkaran;
        LuasSetengahLingkaran=1/2*3.14* (diameter/2)*2;
        return LuasSetengahLingkaran;
    }
static double hitungLuasGabungan(int luas, double LuasSetengahLingkaran) {
    double hitungLuasGabungann;
    hitungLuasGabungann=luas+LuasSetengahLingkaran;
    return hitungLuasGabungann;
}
static void tampilGabungan(double hitungLuasGabungann){
    
    System.out.print("Luas Gabungan bangunan ini adalah "+ hitungLuasGabungann +" cm");
    
}
    public static void main(String[] args) {
        // TODO code application logic here
        
        getpanjanglebardiameter();
    }
}


        
   


