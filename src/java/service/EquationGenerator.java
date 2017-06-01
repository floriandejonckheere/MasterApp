/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Random;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author florian
 */
@WebService(serviceName = "EquationGenerator")
public class EquationGenerator {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "generateEquation")
    public int[] generateEquation(@WebParam(name = "operation") String operation, @WebParam(name = "difficulty") int difficulty) {
        int min = (int) Math.pow(10, difficulty - 1);
        int max = (int) Math.pow(10, difficulty);
        
        int[] result = new int[3];
        
        Random random = new Random();        
        result[0] = min + random.nextInt(min + max);
        result[1] = min + random.nextInt(min + max);
        
        switch(operation) {
            case "+":
                result[2] = result[0] + result[1];
                break;
            case "-":
                result[2] = result[0] - result[1];
                break;
            case "*":
                result[2] = result[0] * result[1];
                break;
            default:
                throw new RuntimeException("Invalid operation");
        }

        return result;
    }
}
