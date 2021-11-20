/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author galileo
 */
public class contohmatriks {
    public static void main(String[] args){
        //buat objek P1
        matriks M= new matriks();
        
        //mengisi matriks
        M.isimatriks(3,4);
        
        //menulis matriks
        System.out.println("isi matrisk : ");
        M.isimatriks(3, 4);
    }

}
