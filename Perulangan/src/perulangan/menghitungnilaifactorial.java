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
public class menghitungnilaifactorial {
    public static void main(String[] args){
        int bil;
        long faktorial=1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Masukan bilangan yg akan dihitung :");
        bil=scanner.nextInt();
        while(bil>=1){
            faktorial +=bil;
            if(bil!=1){
                System.out.print(bil+"x");
                
            }
            else {
                 System.out.print(bil+"=");
            }
                    bil --;
        }
         System.out.println(faktorial);
    }
}
