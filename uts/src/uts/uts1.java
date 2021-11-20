/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author Galileo
 */
public class uts1 {
    public static void main(String[] args) 
    {
    int Pajak,Tarif,Hari,TotBiaya,TotBayar;
      String  Kelas,Pilih,lanjut,a = null;
      boolean lagi;
       Scanner scr=new Scanner (System.in);
  
          
            
        
       
                System.out.println("=======||==||============================================================||==||========");
                System.out.println(":::::::||::||>>>>>Program Pentuan Kamar dan Tarif Pasien Rumah Sakit<<<<<||::||:::::::");
                System.out.println("=======||==||============================================================||==|");
        System.out.println("Pilihan Pembayaran  : \n 1.Umum \n 2.BPJS \n 3.Asuransi");
        System.out.print("Masukan Jenis Pembayaran    : "); 
        Pilih=scr.nextLine();
        
        

        do{       
       switch (Pilih) {
           case  "Umum"  :
               System.out.print("Masukan Kelas (VIP,1,2,3)   : "); Kelas=scr.nextLine();
               System.out.println("Fasilitas untuk Anda adalah");
     
           if ("VIP".equals(Kelas) ) {
               System.out.println("Ruang     : Z");
               Tarif=500000;
               System.out.println("Tarif     : "+Tarif);
                
               System.out.print("Masukan Jumlah Hari dirawat : ");Hari=scr.nextInt();
               
               System.out.println("Pembayaran Anda ");
               TotBiaya=Tarif*Hari;
               System.out.println("Total Biaya Rawat Inap : Rp "+TotBiaya);
               Pajak=Tarif*10/100;
               System.out.println("Pajak       : 10%      : Rp"+Pajak);
               TotBayar=TotBiaya+Pajak;
               System.out.println("Total Bayar             : Rp"+TotBayar);
             
             
             
               
           } else if("1".equals(Kelas) ){
               System.out.println("Ruang     : Y");
               Tarif=400000;
               System.out.println("Tarif     : Rp "+Tarif);
               System.out.print("Masukan Jumlah Hari dirawat : ");Hari=scr.nextInt();
               
               System.out.println("Pembayaran Anda ");
               TotBiaya=Tarif*Hari;
               System.out.println("Total Biaya Rawat Inap : Rp "+TotBiaya);
               Pajak=Tarif*10/100;
               System.out.println("Pajak : 10%  : Rp"+Pajak);
               TotBayar=TotBiaya+Pajak;
               System.out.println("Total Bayar : Rp "+TotBayar);
               
               
           } else if("2".equals(Kelas) ) {
               System.out.println("Ruang     : X");
               Tarif=300000;
               System.out.println("Tarif     : Rp "+Tarif);
               System.out.print("Masukan Jumlah Hari dirawat : ");Hari=scr.nextInt();
               
               System.out.println("Pembayaran Anda ");
               TotBiaya=Tarif*Hari;
               System.out.println("Total Biaya Rawat Inap =Rp"+TotBiaya);
               Pajak=Tarif*10/100;
               System.out.println("Pajak : 10%            : Rp"+Pajak);
               TotBayar=TotBiaya+Pajak;
               System.out.println("Total Bayar            : Rp"+TotBayar);
           } else if ("3".equals(Kelas)){
               System.out.println("Ruang     : W");
               Tarif=200000;
               System.out.println("Tarif     : Rp "+Tarif);
               System.out.print("Masukan Jumlah Hari dirawat :");Hari=scr.nextInt();
               
               System.out.println("Pembayaran Anda ");
               TotBiaya=Tarif*Hari;
               System.out.println("Total Biaya Rawat Inap : Rp "+TotBiaya);
               Pajak=Tarif*10/100;
               
               System.out.println("Pajak    : 10%         : Rp "+Pajak);
               TotBayar=TotBiaya+Pajak;
               System.out.println("Total Bayar            : Rp "+TotBayar);
           }
                   else {
                         System.out.println("Maaf  Ruang tersebut tidak ada");
                           }
             
       
           break;
           
           case "BPJS" :
               System.out.print("Masukan Kelas (1,2,3)       : "); Kelas=scr.nextLine();
               
               System.out.println("Fasilitas untuk Anda adalah ");
               
           if ( "1".equals(Kelas)) {
               System.out.println("Ruang     : X");
               Tarif=300000;
               System.out.println("Tarif     : Rp "+Tarif);
               System.out.print("Masukan Jumlah Hari dirawat : ");Hari=scr.nextInt();
               
               System.out.println("Pembayaran Anda ");
               TotBiaya=Tarif*Hari;
               System.out.println("Total Biaya Rawat Inap : Rp"+TotBiaya);
               Pajak=Tarif*5/100;
               System.out.println("Pajak : 5%             : Rp"+Pajak);
               TotBayar=TotBiaya+Pajak;
               System.out.println("Total Bayar            : Rp"+TotBayar);
           } else if ("2".equals(Kelas) ){
               System.out.println("Ruang     : W");
               Tarif=200000;
               System.out.println("Tarif     : Rp "+Tarif);
               System.out.print("Masukan Jumlah Hari dirawat : "); Hari=scr.nextInt();
               
                System.out.println("Pembayaran Anda ");
               TotBiaya=Tarif*Hari;
               System.out.println("Total Biaya Rawat Inap : Rp"+TotBiaya);
               Pajak=Tarif*5/100;
               System.out.println("Pajak : 5%             : Rp"+Pajak);
               TotBayar=TotBiaya+Pajak;
               System.out.println("Total Bayar            : Rp "+TotBayar);
           } else if ("3".equals(Kelas) ){
               System.out.println("Ruang     : V");
               Tarif=100000;
               System.out.println("Tarif     : Rp "+Tarif);
               System.out.print("Masukan Jumlah Hari dirawat :");Hari=scr.nextInt();
               
                System.out.println("Pembayaran Anda ");
               TotBiaya=Tarif*Hari;
               System.out.println("Total Biaya Rawat Inap : Rp"+TotBiaya);
               Pajak=Tarif*5/100;
               System.out.println("Pajak : 5%             : Rp"+Pajak);
               TotBayar=TotBiaya+Pajak;
               System.out.println("Total Bayar            : Rp"+TotBayar);
           } 
                   else {
                         System.out.println("Maaf Ruang Tersebut Tidak ada");  }
           
           break ;
           
           case "Asuransi" :
               System.out.print("Masukan Kelas (1,2)             : "); Kelas=scr.nextLine();
               
               System.out.println("Fasilitas untuk Anda adalah");
               if ("1".equals(Kelas)) {
                   System.out.println("Ruang     : X");
                   Tarif=300000;
                   System.out.println("Tarif     : Rp "+Tarif);
                   System.out.print("Masukan Jumlah Hari dirawat :");Hari=scr.nextInt();
                   
                    System.out.println("Pembayaran Anda ");
               TotBiaya=Tarif*Hari;
               System.out.println("Total Biaya Rawat Inap : Rp"+TotBiaya);
               Pajak=Tarif*2/100;
               System.out.println("Pajak : 2%             : Rp"+Pajak);
               TotBayar=TotBiaya+Pajak;
               System.out.println("Total Bayar            : Rp"+TotBayar);
               } else if ("2".equals(Kelas) ) {
                   System.out.println("Ruang     : W");
                   Tarif=200000;
                   System.out.println("Tarif     : Rp "+Tarif);
                   System.out.print("Masukan Jumlah Hari dirawat :");Hari=scr.nextInt();
                   
                   System.out.println("Pembayaran Anda ");
               TotBiaya=Tarif*Hari;
               System.out.println("Total Biaya Rawat Inap : Rp"+TotBiaya);
               Pajak=Tarif*2/100;
               System.out.println("Pajak : 2%             : Rp"+Pajak);
               TotBayar=TotBiaya+Pajak;
               System.out.println("Total Bayar            : Rp"+TotBayar);
               }
               else{  
                   System.out.println("Maaf Ruang Tersebut Tidak Ada");
                       
            
               }
              break ;

       }
           
               System.out.println("");
               System.out.print("Apakah Anda Ingin Melakukan Pembayaran Lagi? (y/n)");
             a = scr.nextLine();
             
             
               }while("y".equals(a));
}
}
