/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package op_ternary;
import java.util.Scanner;
/**
 *
 * @author galileo
 */
public class program_gender {
    public static void main(String[] args) {
        String gender,status;
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan Gender(Laki-Laki/Perempuan)\t:");
        gender=input.nextLine();
        System.out.print("Status\t\t:");
        status=input.nextLine();
        System.out.println("Perempuan".equalsIgnoreCase(gender)?("Menikah".equalsIgnoreCase(status)?
        "Hallo ibu" : "Hallo mbak" ):("Menikah".equalsIgnoreCase(status)? "Hallo Bapak" : "Hallo mas"));
         
    }
}
