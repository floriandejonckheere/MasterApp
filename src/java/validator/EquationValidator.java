/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import controller.equation.Equation;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author florian
 */
public class EquationValidator implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return Equation.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Equation equation = (Equation) o;

        if (equation.getUserResult() != equation.getEqResult()) {
            errors.rejectValue("userResult", "result.invalid", "Does not compute");
        }
    }

}
