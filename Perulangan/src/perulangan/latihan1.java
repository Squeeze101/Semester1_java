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
public class latihan1 {
    
    public static void main(String[] args) {
        int n,i,j;
            
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Masukan Nilai n :"); 
        n=keyboard.nextInt();
        for(i=1;i<=n;i++) {
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
}