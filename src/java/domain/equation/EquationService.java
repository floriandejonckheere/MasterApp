/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.equation;

/**
 *
 * @author florian
 */
public class EquationService {

    public static java.util.List<java.lang.Integer> generateEquation(java.lang.String operation, int difficulty) {
        client.EquationGenerator_Service service = new client.EquationGenerator_Service();
        client.EquationGenerator port = service.getEquationGeneratorPort();
        return port.generateEquation(operation, difficulty);
    }
    
}
