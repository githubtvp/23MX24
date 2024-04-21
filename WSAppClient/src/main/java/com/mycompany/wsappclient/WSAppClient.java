/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wsappclient;

/**
 *
 * @author tvp16
 */
public class WSAppClient {

    public static void main(String[] args) {
        try { // Call Web Service Operation
            wsappclient.WSCalc_Service service = new wsappclient.WSCalc_Service();
            wsappclient.WSCalc port = service.getWSCalcPort();
            // TODO initialize WS operation arguments here
            int arg0 = 10;
            int arg1 = 20;
            // TODO process result here
            int result = port.multiply(arg0, arg1);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        System.out.println("Hello World!");
    }
}
