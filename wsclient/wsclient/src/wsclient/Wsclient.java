/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsclient;

/**
 *
 * @author yuva
 */
public class Wsclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=10;
        int y=20;
        int z=add(12,34);
        System.out.println("The value of z is"+z);
                        
    }

    private static int add(int a, int b) {
        ws.NewWebServiceAdd_Service service = new ws.NewWebServiceAdd_Service();
        ws.NewWebServiceAdd port = service.getNewWebServiceAddPort();
        return port.add(a, b);
    }
    
    
}
