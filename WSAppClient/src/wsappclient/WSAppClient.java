/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsappclient;

/**
 *
 * @author tvp16
 */
public class WSAppClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = hello("VP");
        System.out.println(s);
        // Test the Addition method
        int result = addition(5, 3);
        System.out.println("Addition result: " + result);

        // Test the Addition method
//    result = multiply(5, 3);
//    System.out.println("Multiply result: " + result);
    }

    private static String hello(java.lang.String name) {
        calculator.WSCalculator_Service service = new calculator.WSCalculator_Service();
        calculator.WSCalculator port = service.getWSCalculatorPort();
        return port.hello(name);
    }

    private static Integer addition(int a, int b) {
        calculator.WSCalculator_Service service = new calculator.WSCalculator_Service();
        calculator.WSCalculator port = service.getWSCalculatorPort();
        return port.addition(a, b);
    }

//    private static Integer multiply(int a, int b) {
//        calculator.WSCalculator_Service service = new calculator.WSCalculator_Service();
//        calculator.WSCalculator port = service.getWSCalculatorPort();
//        return port.multiply(a, b);
//    }

}
