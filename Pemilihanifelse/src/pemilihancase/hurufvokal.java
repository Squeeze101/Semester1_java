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
public class hurufvokal {
       public static void main (String args[]){
           Scanner input=new Scanner(System.in);
           char huruf;
           System.out.print("Masukan huruf :");
           huruf=input.next().charAt(0);
           
          
           if (huruf=='a'||huruf=='i'||huruf=='u'||huruf=='e'||huruf=='o') {
               System.out.println(huruf+" Merupakan Huruf vokal");
           }
           else {
               System.out.println(huruf +" bukan huruf vokal");
           }
       }
}
