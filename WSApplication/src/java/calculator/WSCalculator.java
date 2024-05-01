/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author tvp16
 */
@WebService(serviceName = "WSCalculator")
public class WSCalculator {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Addition")
    public Integer Addition(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a + b;
    }   

    /**
     * Web service operation
     */
//    @WebMethod(operationName = "Multiply")
//    public Integer Multiply(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
//        //TODO write your implementation code here:
//        return a * b;
//    }
}
