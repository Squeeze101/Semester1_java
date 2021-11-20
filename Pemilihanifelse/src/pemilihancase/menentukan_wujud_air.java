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
public class menentukan_wujud_air {
    public static void main(String[] args){
        double t;
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan Suhu Air :");
        t=input.nextInt();
        if(t <= 0) {
            System.out.println("Padat");
        }
        else if (t>0 && t<100) {
            System.out.println("Cair");     
        }
        else if (t>= 100) {
            System.out.println("Gas dan uap");
        }
        else {
            System.out.print("Pemilihan tidak diketahui");
        }
    }
}
