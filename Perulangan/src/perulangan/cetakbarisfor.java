/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;
import java.util.*;
/**
 *
 * @author galileo
 */
public class cetakbarisfor {
    public static void main(String[] args){
        int i,n;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Masukan N :");
        n=keyboard.nextInt();
        for(i=1;i<=n;i++){
            System.out.print(i+",");
        }
    }
}
