/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipedatabentukan;
import java.util.Scanner;
/**
 *
 * @author galileo
 */
public class biodatas {
    
    public static void main(String[] args){
        class mhs {
            String nama,nim;
            int nilai;
        }
        mhs m=new mhs();
        Scanner s=new Scanner(System.in);
        System.out.print("inputkan nama\t :");
        m.nama=s.nextLine();
        System.out.print("inputkan NIM\t :");
        m.nim=s.nextLine();
        System.out.print("Inputkan Nilai\t :");
        m.nilai=s.nextInt();
        System.out.println("------HASIL------");
        System.out.println("Nama\t :"+m.nama);
        System.out.println("Nim\t :"+m.nim);
        System.out.println("Nilai\t :"+m.nilai);
        
        
    }
    
}
