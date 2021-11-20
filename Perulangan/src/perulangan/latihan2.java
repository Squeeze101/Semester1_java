/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

/**
 *
 * @author galileo
 */
public class latihan2 {
       
   public static void main(String[] args) {
   
      int n=10,k,i,spasi;
      
        for ( i = 0; i <= n; i++) //for induk untuk pindah baris
        {
            for (spasi = 0; spasi < n - i; spasi++) { //untuk menambahkan spasi kekiri
                System.out.print(" ");
            }
            for ( k = 10; k <= i; k++) {  //untuk menampilkan angkanya
                System.out.print(k + " "); 
            }
            System.out.println();
    }
    }
}
