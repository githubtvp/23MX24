/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/EjbWebService.java to edit this template
 */
package calc;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author tvp16
 */
@WebService(serviceName = "WSCalc")
@Stateless()
public class WSCalc {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "Add")
    public int add(int a, int b) {
        return a + b;
    }

    @WebMethod(operationName = "Multiply")
    public int multiply(int a, int b) {
        return a * b;
    }
}
