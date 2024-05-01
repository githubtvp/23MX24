/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromeclient;

import java.util.Scanner;

/**
 *
 * @author tvp16
 */
public class PalindromeClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a string to check if it is Palindrome : ");
        String str;
        str = kb.nextLine();
        String testStr = str; 
        showResult(testStr);  
    }

    private static void showResult (String str)
    {
        String testStr = str;
        Boolean result = chkPal(testStr);
        if(result)
        {
            System.out.println(testStr + " is Palindrome");
        }
        else
        {
            System.out.println(testStr + " is NOT a Palindrome");            
        }      
    }
    private static boolean chkPal(java.lang.String str) {
        palchk.PalChk_Service service = new palchk.PalChk_Service();
        palchk.PalChk port = service.getPalChkPort();
        return port.chkPal(str);
    }    
}
