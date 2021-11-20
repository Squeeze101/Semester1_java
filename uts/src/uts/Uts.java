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
public class Uts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int    riwayat ,tarif ,  rawat ;
        long pajak,total,totalbayar;
        char kls = 0;
        String uss,kelas;
        Scanner scr = new Scanner (System.in);
        
        System.out.println("program menentukan kamar dan tarif pasien");
        System.out.print("Jenis Pembayaran (Umum/BPJS/Asuransi) :");
        uss = scr.nextLine();
        
        switch (uss){
            case "Umum": 
                System.out.println("pembayaran umum ");
                System.out.println("pilih kelas \n VIP \n 1 \n 2 \n 3");
                System.out.print("masukan kelas : ");
                kelas = scr.nextLine();
        switch (kelas) {
            case "VIP" :
                System.out.println("ruangan = z tarif Rp. 500.000");
                System.out.print("masukan jumlah hari di rawat : ");
                rawat = scr.nextInt();
                System.out.println(" pembayaran ");
                total = rawat*500000;
                pajak = total*10/100;
                totalbayar = total+pajak;
                System.out.println("total biaya rawat inap = Rp. " + total);
                System.out.println("pajak = 10% = Rp. " +pajak);
                System.out.println("total babyar : "+totalbayar);
                break;
            case "1":
                System.out.println("ruangan = y tarif Rp. 400.000");
                System.out.println("masukan jumlah hari di rawat : ");
                rawat = scr.nextInt();
                System.out.println(" pembayaran ");
                total = rawat*400000;
                pajak = total*10/100;
                totalbayar = total+pajak;
                System.out.println("total biaya rawat inap = Rp. " + total);
                System.out.println("pajak = 10% = Rp. " +pajak);
                System.out.println("total babyar : "+totalbayar);
                break;
            case "2":
                System.out.println("rungan = x tarif Rp. 300.000");
                System.out.println("masukan jumlah hari rawat : ");
                rawat = scr.nextInt();
                System.out.println("pembayaran : ");
                total = rawat*400000;
                pajak = total*10/100;
                totalbayar = total+pajak;
                System.out.println("total biaya rawat inap = Rp. " +total);
                System.out.println(" pajak = 10% = Rp. " +pajak);
                System.out.println("total bayar = "+ totalbayar);
                break;
            case "3":
                System.out.println("ruangan = w tarif Rp. 200.000");
                System.out.println("masukan jumlah hari rawat : ");
                rawat = scr.nextInt();
                System.out.println("pembayaran : ");
                total = rawat*20000;
                pajak = total*10/100;
                totalbayar = total+pajak;
                System.out.println("total biaya rawat inap = Rp. " +total);
                System.out.println("pajak = 10=% = Rp. " + pajak);
                System.out.println("total bayar = "+totalbayar);
                break;
            default:
                break;
        }
break;
        
       
            case "BPJS": 
                System.out.println("pembayaran BPJS");
                System.out.println("pilih kelas  \n 1 \n 2 \n 3");
                System.out.println("masukan kelas : ");
                kelas  = scr.nextLine();
                
        switch (kelas) {
            case "1":
                System.out.println("ruangan = x tarif Rp.300.000 ");
                System.out.print("masukan jumlah hari di rawat = ");
                rawat = scr.nextInt();
                System.out.println("pembayaran : ");
                total = rawat*300000;
                pajak = total*5/100;
                totalbayar = total+pajak;
                System.out.println("total biaya rawat inap = Rp. "+total);
                System.out.println("pajak = 5% = Rp. "+pajak);
                System.out.println("total bayar = "+totalbayar);
                break;
            case "2":
                System.out.println("ruangan = w tarif Rp.200.000 ");
                System.out.print("masukan jumlah hari di rawat = ");
                rawat = scr.nextInt();
                System.out.println("pembayaran : ");
                total = rawat*200000;
                pajak = total*5/100;
                totalbayar = total+pajak;
                System.out.println("total biaya rawat inap = Rp. "+total);
                System.out.println("pajak = 5% = Rp. "+pajak);
                System.out.println("total bayar = "+totalbayar);
                break;
            case "3":
                System.out.println("ruangan = x tarif Rp.100.000 ");
                System.out.print("masukan jumlah hari di rawat = ");
                rawat = scr.nextInt();
                System.out.println("pembayaran : ");
                total = rawat*100000;
                pajak = total*5/100;
                totalbayar = total+pajak;
                System.out.println("total biaya rawat inap = Rp. "+total);
                System.out.println("pajak = 5% = Rp. "+pajak);
                System.out.println("total bayar = "+totalbayar);
                break;
            default:
                break;
        }
break;
                case "Asuransi": 
                System.out.println("pembayaran asuransi");
                System.out.println("pilih kelas  \n 1 \n 2 ");
                System.out.print("masukan kelas : ");
                kelas  = scr.nextLine();
                
                if("1".equals(kelas)){
                    System.out.println("ruangan = x tarif Rp.300.000 ");
                    System.out.print("masukan jumlah hari di rawat = ");
                    rawat = scr.nextInt();
                    System.out.println("pembayaran : ");
                    total = rawat*300000;
                    pajak = total*2/100;
                    totalbayar = total+pajak;
                    System.out.println("total biaya rawat inap = Rp. "+total);
                    System.out.println("pajak = 2% = Rp. "+pajak);
                    System.out.println("total bayar = "+totalbayar);
                    
                }else if ("2".equals(kelas)){
                    System.out.println("ruangan = w tarif Rp.200.000 ");
                    System.out.print("masukan jumlah hari di rawat = ");
                    rawat = scr.nextInt();
                    System.out.println("pembayaran : ");
                    total = rawat*200000;
                    pajak = total*5/100;
                    totalbayar = total+pajak;
                    System.out.println("total biaya rawat inap = Rp. "+total);
                    System.out.println("pajak = 5% = Rp. "+pajak);
                    System.out.println("total bayar = "+totalbayar);
                    
                    
                    
                }break;
                
                default:
                System.out.println("terimakasih");
                    
                }
                
        
                
        }
    }
    
    

