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
public class pemilihancase {
    
    public static void main(String[] args) {
            String kota,kodepos;
            Scanner input=new Scanner(System.in);
            System.out.println("Pilihan Kota Adalah Padang,Bandung,Solo,Denpasar dan Palu");
            System.out.print("Inputkan kota :");
            kota=input.nextLine();
            switch(kota){
                case "Padang" :
                    kodepos="25000"; break;
                case "Bandung" :
                    kodepos="40\"B100"; break;
                case "Solo" :
                    kodepos="51000"; break;
                case "Denpasar" :
                    kodepos="72000"; break;
                case "Palu" :
                    kodepos="923000"; break;
                default:
                    kodepos="tidak ada dalam daftar";
                
            }
            System.out.println(kodepos);
    }       
    
}
