/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipedatabentukan;

/**
 *
 * @author galileo
 */
public class waktukonversi {
     public static void main(String[] args) {
        
    
    class waktu {
        int hh,mm,ss;
    }
    waktu w=new waktu();
    int hasil;
    
    w.hh=4;
    w.mm=20;
    w.ss=10;
    
    hasil=w.hh*3600+w.mm*60+w.ss;
    System.out.println("Konversi dari "+w.hh + " jam "+w.mm+" menit "+w.ss+" detik");
    System.out.println("Detik ="+hasil);
    
}
}
