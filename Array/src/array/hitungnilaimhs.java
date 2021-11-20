/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Scanner;
/**
 *
 * @author galileo
 */
public class hitungnilaimhs {
    public static void main(String[] args) {
        int i,n=100;
        double [] NilUjian=new double[n];
        char[] indeks =new char[n];
        
        Scanner keyboard =new Scanner(System.in);
        System.out.print("Inputkan jumlah mahasiswa :");
        n=keyboard.nextInt();
        
        for(i=0;i<n;i++) {
            System.out.print("Inputkan nilai mahasiswa "+(i+1)+": " );
            NilUjian[i]=keyboard.nextInt();
        }
        for(i=0;i<n;i++) {
            if(NilUjian[i]>= 80){
                indeks[i] ='A';
            }
            else if(NilUjian[i]>= 70){
                indeks[i] ='B';
            }
            else if(NilUjian[i]>= 55){
                indeks[i] ='C';
            }
            else if(NilUjian[i]>= 45){
                indeks[i] ='D';
            }
            else {
                indeks[i] ='E';
            }
        }
        System.out.println("\n\tNilai\tIndeks");
        for(i=0;i<n;i++){
            System.out.println("Data "+(i+1)+": "+NilUjian[i]+"\t"+indeks[i]);
        }
    }
}
