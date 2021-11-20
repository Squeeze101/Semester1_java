/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;
import java.util.Scanner;


/**
 *
 * @author galileo
 */
public class soalno3 {


    public static void main(String[] args){
        int bil;
        long sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input bilangan\t=");
        bil=scanner.nextInt();
        System.out.print("Total Nilai\t=");
        while(bil>=1){
            sum +=bil;

                    bil --;
        }
         System.out.println(sum);
    }
}


