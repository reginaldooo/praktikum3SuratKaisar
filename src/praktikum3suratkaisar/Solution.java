/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3suratkaisar;
import java.util.Scanner;
/**
 *
 * @author REGIN
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc    = new Scanner(System.in);
        String input  = sc.nextLine();
        int N         = sc.nextInt();
        String output = "";
        System.out.println(pengolahan(output, N, input));
    }
    
    public static String pengolahan(String output, int N, String input){
        output = "";
        char hasil;
        for(int i=0; i < input.length();i++){
            hasil = input.charAt(i);
            if(hasil >= 'a' && hasil <= 'z'){
                hasil = (char)(hasil + N);
                if(hasil > 'z') {
                    hasil = (char)(hasil+'a'-'z'-1);
                    }
                output+= hasil;
            }else if(hasil >= 'A' && hasil <= 'Z') {
                hasil = (char) (hasil + N);    
                if(hasil > 'Z') {
                    hasil = (char) (hasil+'A'-'Z'-1);
                }
                    output += hasil;
            }else{
                output += hasil;   
            }  
        }   
        return output;
    }     
}