/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author galileo
 */
public class array1dimensi {
    public static void main(String[] args){
        String[] arraybuah ={"Apel","Anggur","Jeruk","Semangka","Pepaya" };
        System.out.println("Nama buah\t: ");
        
        System.out.println("Indeks ke-" + 0 +"\t:" + arraybuah[0]);
        System.out.println("Indeks ke-" + 1 +"\t:" + arraybuah[1]);
        System.out.println("Indeks ke-" + 2 +"\t:" + arraybuah[2]);
        System.out.println("Indeks ke-" + 3 +"\t:" + arraybuah[3]);
        System.out.println("Indeks ke-" + 4 +"\t:" + arraybuah[4]);
        
        System.out.println();
        //menganti elemet
        arraybuah[0] ="Alpukat";
        arraybuah[1] ="Mangga";
        
        System.out.println("Nama buah yang diganti\t: ");
        System.out.println("Indeks ke-" + 0 +"\t:" + arraybuah[0]);
        System.out.println("Indeks ke-" + 1 +"\t:" + arraybuah[1]);
        System.out.println("Indeks ke-" + 2 +"\t:" + arraybuah[2]);
        System.out.println("Indeks ke-" + 3 +"\t:" + arraybuah[3]);
        System.out.println("Indeks ke-" + 4 +"\t:" + arraybuah[4]);
        
        //check ukuran array
        System.out.println("\nUkuruan Array adalah\t: " +arraybuah.length);
    }
}
