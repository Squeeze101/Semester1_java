/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persegi;

/**
 *
 * @author galileo
 */
public class Persegi {

    /**
     * @param the command line arguments
     */
    //prosedur keliling persegi
    public static int keliling;
    public static void kelilingpersegi(int sisi){
         keliling = 4*sisi;
    }
    public static int getkeliling(){
        return keliling;
    }
    public static void main(String[] args) {
        kelilingpersegi(5);
        System.out.println("Keliling= "+getkeliling());
        
    }
    
}
