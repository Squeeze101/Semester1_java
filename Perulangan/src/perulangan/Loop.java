/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;
import java.util.Scanner;
/**
 *
 * @author galileo
 */
public class Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       Scanner keyboard=new Scanner(System.in);
       int bil;
       bil=0;
       System.out.print("Masukan Nilai N :");
       int n=keyboard.nextInt();
       while(bil<=n) {
           System.out.println("Ke ="+bil);
            bil++;
       }
    }
    
}
