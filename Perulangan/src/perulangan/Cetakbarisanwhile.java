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
public class Cetakbarisanwhile {
    public static void main(String [] args){
         int i = 1,n;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Masukan N :");
        n=keyboard.nextInt();
        while(i<=n) {
            System.out.print(i+",");
            i=i+1;
        } 
    }
}
